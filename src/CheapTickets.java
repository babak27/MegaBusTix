//Improve graphics, insert a hyperlink in the destinations.txt, insert a hyperlink TO destinations.txt

//ONLY VALID FOR 2013.... fix dat also month #13 dont exist

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
//import java.awt.Font;

public class CheapTickets extends SwingWorker<Void, Void>{
  private ArrayList<Integer> dest;
  private int start;
  private int maxPrice;
	public CheapTickets(int start, ArrayList<Integer> destinations, int maxPrice){
		this.start=start;
		dest=destinations;
		this.maxPrice=maxPrice;
		
	}
	
	
     
 
	
	
    protected Void doInBackground()  {
      DestinationMap places = new DestinationMap();
      Calendar today = Calendar.getInstance();
      int month= today.get(Calendar.MONTH) +1;
      int day = today.get(Calendar.DAY_OF_MONTH);
      int year= today.get(Calendar.YEAR);
    
      
      Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
      
      JFrame toDisplay = new JFrame("Search Complete");
      toDisplay.setAlwaysOnTop(true);
      toDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      toDisplay.setVisible(false);
      toDisplay.setLayout(new FlowLayout());
      toDisplay.setSize(300,200);
      toDisplay.setLocation((int)dimension.getWidth()/3, (int)dimension.getHeight()/3);
      
      String workingDir = System.getProperty("user.dir");
      JLabel message = new JLabel("");
      message.setText("<html>Cheap Tickets has finished its search <br /> See the file Destinations.txt in<br/> "+ workingDir+" <br/> for results</html>");
     
      toDisplay.add(message,BorderLayout.CENTER);
   
     // Font f = new Font("sans-serif",Font.BOLD,20);
      
      int searchTill= day<15? month+3:month+4;
      boolean matchesExist=false;
      try{
    	  File writeTo = new File("Destinations.txt");
    	  BufferedWriter bw = new BufferedWriter(new FileWriter(writeTo),32768);
    	
      for(;month<searchTill;month++){
        for(;day<=31;day++){
          for( int i:dest){
            URL megaBus = new URL("http://us.megabus.com/JourneyResults.aspx?originCode="+start+"&destinationCode="+i+"&outboundDepartureDate="+month+"%2f"+day+"%2f"+year+"&inboundDepartureDate=&passengerCount=1&transportType=0&concessionCount=0&nusCount=0&outboundWheelchairSeated=0&outboundOtherDisabilityCount=0&inboundWheelchairSeated=0&inboundOtherDisabilityCount=0&outboundPcaCount=0&inboundPcaCount=0&promotionCode=&withReturn=0");
            URLConnection connection = megaBus.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            ArrayList<Double> prices = new ArrayList<Double>();
            while ((inputLine = in.readLine()) != null) {
              if(inputLine.contains("</p>") && inputLine.contains("$")){
                inputLine= inputLine.substring(0,inputLine.length()-4);
                inputLine= inputLine.replace("$","");
                inputLine=inputLine.replaceAll("//s", "");
                Double price =Double.parseDouble(inputLine);
                prices.add(price);
              } 
            }
            if(prices.size()!=0){
              int lowest=0;
              for(int k=0; k<prices.size();k++){
                if(prices.get(lowest)>=prices.get(k)){
                  lowest=k;
                }
              }
              if(prices.get(lowest)<=this.maxPrice){
            	  matchesExist=true;
                bw.write("The price is $"+ prices.get(lowest)+" travelling to "+ places.get(i)+" on "+ month+"/"+day);
              bw.newLine();
              }
            }
            in.close();
        
          }
          if(month==12 && day==31){
          	year++;
          	month=0;
          	searchTill=searchTill%12;
        }
        }
 
        day=1;
      }
      BufferedReader check = new BufferedReader(new FileReader("Destinations.txt"));
      if(!matchesExist){
    	  bw.write("No matches found for that price to those locations");
    	  bw.newLine();
      }
      check.close();
      if(matchesExist)
    	  bw.write("See us.megabus.com for return trips and to purchase tickets");
      bw.close();
      toDisplay.setVisible(true);
      
      }
    catch (UnknownHostException e){
    	toDisplay.dispose();
    	JOptionPane.showMessageDialog(toDisplay,
    		    "No Internet connection, please try again later",
    		    "Error",
    		    JOptionPane.ERROR_MESSAGE);
    }
    catch (MalformedURLException e){
    	toDisplay.dispose();
    	JOptionPane.showMessageDialog(toDisplay,
    		    "MegaBus changed their search, return to programmer for a patch",
    		    "Error",
    		    JOptionPane.ERROR_MESSAGE);
    }
    catch (IOException e){
    	toDisplay.dispose();
      JOptionPane.showMessageDialog(toDisplay,
    		    e.getMessage(),
    		    "Error",
    		    JOptionPane.ERROR_MESSAGE);
    }
      return null;
    }
    
    
  }
