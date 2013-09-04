
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener; // waits for user to do sumthin
import java.awt.event.ActionEvent; 
import javax.swing.JFrame;
import javax.swing.JButton;


public class StartSelector extends JFrame{
  
  private JButton burlington;
  private JButton chicago;
  private JButton los_angeles ;
  private JButton  new_haven;
  private JButton  boston;
  private JButton  washington_DC;
  private JButton  new_york_city;
  private JButton  toronto;
  private JButton st_louis;
  private JButton new_orleans;
  private JButton cleveland;
  private JButton champaign;
  
  
  public StartSelector(){
    super("Select starting location");
    setLayout(new FlowLayout());
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((int)dimension.getWidth()/3, (int)dimension.getHeight()/3);
	setLayout(new FlowLayout());
    
    burlington = new JButton("Burlington, VT");
    add(burlington);
    
    chicago=new JButton("Chicago, IL");
    add(chicago);
    
    st_louis= new JButton("St Louis, MO");
    add(st_louis);
                        
    los_angeles= new JButton("Los Angeles, CA");
    add(los_angeles);
    
    new_haven= new JButton("New Haven, CT");
    add(new_haven);
    
    boston= new JButton("Boston, MA");
    add(boston);
    
    washington_DC= new JButton("Washington, DC");
    add(washington_DC);
    
    new_york_city=new JButton("New York, NY");
    add(new_york_city);
    
    toronto= new JButton("Toronto, ON");
    add(toronto);
    
    st_louis = new JButton("St. Louis, MO");
    add(st_louis);
    
    new_orleans = new JButton("New Orleans, LA");
    add(new_orleans);
    
    cleveland=new JButton("Cleveland, OH");
    add(cleveland);
    champaign = new JButton("Champaign, IL");
    add(champaign);
  
    
    Handler handler = new Handler();
    chicago.addActionListener(handler);
    burlington.addActionListener(handler);
    boston.addActionListener(handler);
    new_york_city.addActionListener(handler);
    toronto.addActionListener(handler);
    new_haven.addActionListener(handler);
    washington_DC.addActionListener(handler);
    los_angeles.addActionListener(handler);
    st_louis.addActionListener(handler);
    new_orleans.addActionListener(handler);
    cleveland.addActionListener(handler);
    champaign.addActionListener(handler);
  }
  
  private class Handler implements ActionListener{
    public void actionPerformed(ActionEvent event){
    	/*DestinationMap dm = new DestinationMap();
    	System.out.println(event.getActionCommand());
    	StartingPoint ss = new StartingPoint(event.getActionCommand());
        CheapTickets.getCheapTickets(ss.getIndex(),ss.getDestinations(),10);*/
    	dispose();
    	DestinationSelector ds = new DestinationSelector(event.getActionCommand());
    	StartingPoint sp = new StartingPoint(event.getActionCommand());
    	ds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	if(sp.getDestinations().size()>25)
  	  		ds.setSize(500,500);
    	else
    		ds.setSize(500,(int)(sp.getDestinations().size()/3.0*100));
  	  	ds.setVisible(true);
  
    }
  }
 }
  

    