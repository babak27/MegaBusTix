import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Complete extends JFrame{
	private JLabel finished;
	public Complete(){
		super("Program has finished");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		String workingDir = System.getProperty("user.dir");
		finished= new JLabel("<html>Cheap Tickets has finished its search <br /> See the file Destinations.txt in<br/> "+ workingDir+" <br/> for results</html>", SwingConstants.CENTER);
		//finished.setPreferredSize(new Dimension( (int)dimension.getWidth() / 2, (int)dimension.getHeight()/2 ));
		setLayout(new FlowLayout());
		getContentPane().add(finished, BorderLayout.CENTER);
		setLocation((int)dimension.getWidth()/3, (int)dimension.getHeight()/3);
		
	}

}
