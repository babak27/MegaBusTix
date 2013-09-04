import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener; // waits for user to do sumthin
import java.awt.event.ActionEvent; 
import javax.swing.JFrame;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DestinationSelector extends JFrame{
	private DestinationMap dm = new DestinationMap();
	private ReverseMap rm = new ReverseMap();
	private ArrayList<JCheckBoxMenuItem> checkboxes=  new ArrayList<JCheckBoxMenuItem>();
	private StartingPoint startPoint;
	private JCheckBoxMenuItem selectAll;
	private JCheckBoxMenuItem selectNone;
	private JButton submit;
	private ArrayList<JCheckBoxMenuItem> checked = new ArrayList<JCheckBoxMenuItem>();
	public static int startingP = 0;
	public PleaseWait wait;
	
	public DestinationSelector(String start){
		super("Select where to go");
		setLayout(new FlowLayout());
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLocation((int)dimension.getWidth()/3, (int)(dimension.getHeight()/4));
		
		
		startingP = rm.get(start);
		
	    startPoint = new StartingPoint(start);
		for(int i:startPoint.getDestinations()){
		JCheckBoxMenuItem s = new JCheckBoxMenuItem(dm.get(i));
		Listener l = new Listener();
		s.addActionListener(l);
		add(s);
		checkboxes.add(s);
		s.setSelected(true);
		}
		
		selectAll = new JCheckBoxMenuItem("Select All");
		selectNone = new JCheckBoxMenuItem("Select None");
		SelectAll sa = new SelectAll();
		SelectNone sn = new SelectNone();
		selectAll.addActionListener(sa);
		selectNone.addActionListener(sn);
		add(selectAll,BorderLayout.CENTER);
		add(selectNone,BorderLayout.CENTER);
		
		submit = new JButton("Submit");
		add(submit,BorderLayout.CENTER);
		Submit s = new Submit();
		submit.addActionListener(s);

}
	public class Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			//addDest(event.getActionCommand());
		}
		}
	public class SelectAll implements ActionListener{
		public void actionPerformed(ActionEvent event){
		// if(checked.size() != checkboxes.size()){
			for(int i=0; i<checkboxes.size();i++){
				 if(!checkboxes.get(i).isSelected()){
					 checkboxes.get(i).setSelected(true);
					// checked.add(checkboxes.get(i));
				 }
			 }
		// }
		 selectAll.setSelected(false);
		}
	}
	public class SelectNone implements ActionListener{
		public void actionPerformed(ActionEvent event){
			//if(checked.size() != 0){
				for(int i=0; i<checkboxes.size(); i++){
					if(checkboxes.get(i).isSelected()){
						checkboxes.get(i).setSelected(false);
						//checked.clear();
					//}
				}
			}
			selectNone.setSelected(false);
		}
	}
	public class Submit implements ActionListener{
		public void actionPerformed(ActionEvent event){
			for(int i=0; i<checkboxes.size();i++){
				if(checkboxes.get(i).isSelected())
					checked.add(checkboxes.get(i));
			}
			ArrayList<Integer> dest = new ArrayList<Integer>();
			for(int i=0;i<checked.size();i++){
				if(checked.get(i).getText() != null){
				Integer x = rm.get(checked.get(i).getText());
				dest.add(x);
				}
			}
			boolean goodNumber=false;
			int price=0;
			while(!goodNumber){
				try{
		    String maxPrice = JOptionPane.showInputDialog("Enter Maximum Price");
		    price = Integer.parseInt(maxPrice);
		    goodNumber=true;
				}
				catch(Exception e){}
			}
			dispose();
			
			CheapTickets ct = new CheapTickets(startingP, dest, price);
			PleaseWait pw = new PleaseWait();
			pw.setVisible(true);
			pw.setSize(300,150);
			ct.execute();

			
		}
	}
	}

