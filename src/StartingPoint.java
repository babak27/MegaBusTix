import java.util.ArrayList;
public class StartingPoint {
  private ArrayList<Integer> destinations = new ArrayList<Integer>();
  private int index;
  public StartingPoint(String i){
    if(i.contains("Chicago")){//chicago
      int[] temp = {289,292,98,102,103,104,105,317,106,107,330,331,115,116,117,324,298,300,119,120,121,144,291,126,136,430,407,140};
      for(int x:temp){
        destinations.add(x);
    }
      index=100;
    }
    if(i.contains("Burlington")){//burlington
      int[] temp= {90,94,112,123,301};
      for(int x:temp){
        destinations.add(x);
    }
      index=96;
    }
    if(i.contains("Los Angeles")){//LA
      int[] temp={412,413,414,417};
      for(int x:temp){
        destinations.add(x);
    }
      index=390;
    }
    if(i.contains("New Haven")){//New Haven
      int[] temp={94,112,123};
      for(int x:temp){
        destinations.add(x);
    }
      index =122;
    }
    if(i.contains("Boston")){//Boston
      int[] temp={143,96,112,122,123,127,129,135,142};
      for(int x:temp){
        destinations.add(x);
    }
      index=94;
    }
    if(i.contains("Washington")){//DC
      int[] temp={143,94,95,99,101,131,110,118,299,123,389,127,128,132,135,145};
      for(int x:temp){
        destinations.add(x);
    }
      index=142;
    }
    if(i.contains("New York")){//NYC
      int[] temp={89,90,91,92,143,93,94,273,95,96,99,101,103,107,131,316,110,112,118,305,122,389,127,128,304,130,132,134,301,137,138,139,140,145,142};
      for(int x:temp){
        destinations.add(x);
    }
      index=123;
    }
    if(i.contains("Toronto")){//Toronto
      int[] temp={143,273,95,123,127,142};
      for(int x:temp){
        destinations.add(x);
    }
      index=145;
    }
    if(i.contains("St. Louis")){//Toronto
        int[] temp={100,104,117,120};
        for(int x:temp){
          destinations.add(x);
      }
        index=136;
      }
    
    if(i.contains("New Orleans")){//Toronto
        int[] temp={289,318,293,294};
        for(int x:temp){
          destinations.add(x);
      }
        index=303;
      }
    if(i.contains("Cleveland")){//Toronto
        int[] temp={91,289,95,290,100,102,105,107,108,118,408,123,128,137,140};
        for(int x:temp){
          destinations.add(x);
      }
        index=103;
      }
    if(i.contains("Champaign")){
    	int[] temp ={289,292,100,317,324,120,407};
    	for(int x:temp){
    		destinations.add(x);
    	}
    		
    }
    index=98;
    
  }
  public ArrayList<Integer> getDestinations(){
    ArrayList<Integer> temp= new ArrayList<Integer>();
    for(int i=0; i<destinations.size();i++){
      temp.add(destinations.get(i));
    }
    return temp;
  }
  public int getIndex(){
	  return index;
  }
  }

