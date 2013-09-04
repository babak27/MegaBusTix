import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class PleaseWait extends JFrame{
	private JLabel wait;
	public PleaseWait(){
		super("Please Wait");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((int)dimension.getWidth()/3, (int)dimension.getHeight()/3);
        wait = new JLabel("<html>CheapTix is currently running<br /> Please do not close this box or open the file <br /> Destinations.txt <br /> Until instructed to do so.</html>", SwingConstants.CENTER);
        setLayout(new FlowLayout());
        add(wait, BorderLayout.CENTER);
		setLocation((int)dimension.getWidth()/3, (int)dimension.getHeight()/3);
        //CheapTickets ct = new CheapTickets(start, dest, maxPrice);
      //  ct.doInBackground();
       
		
		
	}
	

}
