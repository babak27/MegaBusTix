import java.util.HashMap;
public class DestinationMap{
  protected HashMap<Integer,String> places;// change to private if not needed
  protected int[] locations = {296,331,110,111,112,318,115,116,295,117,118,417,408,324,390,298,300,
	  119,120,121,144,294,293,299,291,305,122,303,
	  123,389,413,126,297,127,128,129,304,130,418,
	  132,133,416,134,415,321,414,412,301,135,419,136,430,137,138,139,140,145,142};;
  public DestinationMap(){
    places = new HashMap<Integer,String>();
      places.put(new Integer(89), new String("Albany, NY"));
      places.put(new Integer(90), "Amherst, MA");
      places.put(new Integer(91), "Ann Arbor, MI");
      places.put(new Integer(302), "Athens, GA");
      places.put(new Integer(289), "Atlanta, GA");
      places.put(new Integer(320), "Austin, TX");
      places.put(new Integer(143), "Baltimore, MD");
      places.put(new Integer(93), "Binghamton, NY");
      places.put(new Integer(292), "Birmingham, AL");          
      places.put(new Integer(94), "Boston, MA");
      places.put(new Integer(273), "Buffalo Airport, NY");
      places.put(new Integer(95), "Buffalo, NY");
      places.put(new Integer(96), "Burlington, VT");
      places.put(new Integer(98), "Champaign, IL");
      places.put(new Integer(99), "Charlotte, NC");
      places.put(new Integer(290), "Chattanooga, TN");
      places.put(new Integer(100), "Chicago, IL");           
      places.put(new Integer(101), "Christiansburg, VA");           
      places.put(new Integer(102), "Cincinnati, OH");           
      places.put(new Integer(103), "Cleveland, OH");           
      places.put(new Integer(104), "Columbia, MO");           
      places.put(new Integer(105), "Columbus, OH");           
      places.put(new Integer(317), "Dallas/Fort Worth, TX");           
      places.put(new Integer(106), "Des Moines, IA");           
      places.put(new Integer(107), "Detroit, MI");           
      places.put(new Integer(131), "Durham, NC");           
      places.put(new Integer(330), "East Lansing, MI");           
      places.put(new Integer(108), "Erie, PA");           
      places.put(new Integer(316), "Fairhaven, MA");           
      places.put(new Integer(296), "Gainesville, FL");           
      places.put(new Integer(331), "Grand Rapids, MI");           
      places.put(new Integer(110), "Hampton, VA");           
      places.put(new Integer(111), "Harrisburg, PA");           
      places.put(new Integer(112), "Hartford, CT");           
      places.put(new Integer(318), "Houston, TX");           
      places.put(new Integer(115), "Indianapolis, IN");           
      places.put(new Integer(116), "Iowa City, IA");           
      places.put(new Integer(295), "Jacksonville, FL");
      places.put(new Integer(117), "Kansas City, MO");           
      places.put(new Integer(118), "Knoxville, TN");           
      places.put(new Integer(417), "Las Vegas, NV");           
      places.put(new Integer(408), "Lexington, KY");           
      places.put(new Integer(324), "Little Rock, AR");           
      places.put(new Integer(390), "Los Angeles, CA");           
      places.put(new Integer(298), "Louisville, KY");           
      places.put(new Integer(300), "Madison, U of Wisc, WI");           
      places.put(new Integer(119), "Madison, WI");           
      places.put(new Integer(120), "Memphis, TN");           
      places.put(new Integer(121), "Milwaukee, WI");           
      places.put(new Integer(144), "Minneapolis, MN");           
      places.put(new Integer(294), "Mobile, AL");           
      places.put(new Integer(293), "Montgomery, AL");           
      places.put(new Integer(291), "Nashville, TN");           
      places.put(new Integer(299), "Morgantown, WV");           
      places.put(new Integer(305), "New Brunswick, NJ");           
      places.put(new Integer(122), "New Haven, CT");           
      places.put(new Integer(303), "New Orleans, LA");           
      places.put(new Integer(123), "New York, NY");           
      places.put(new Integer(389), "Newark, DE");           
      places.put(new Integer(413), "Oakland, CA");           
      places.put(new Integer(126), "Omaha, NE");           
      places.put(new Integer(297), "Orlando, FL");           
      places.put(new Integer(127), "Philadelphia, PA");           
      places.put(new Integer(128), "Pittsburgh, PA");           
      places.put(new Integer(129), "Portland, ME");           
      places.put(new Integer(304), "Princeton, NJ");           
      places.put(new Integer(130), "Providence, RI");           
      places.put(new Integer(418), "Reno, NV");           
      places.put(new Integer(132), "Richmond, VA");
      places.put(new Integer(133), "Ridgewood, NJ");
      places.put(new Integer(416), "Riverside, CA");
      places.put(new Integer(134), "Rochester, NY");
      places.put(new Integer(415), "Sacramento, CA");
      places.put(new Integer(321), "San Antonio, TX");
      places.put(new Integer(414), "San Francisco, CA");
      places.put(new Integer(412), "San Jose, CA");
      places.put(new Integer(301), "Saratoga Springs, NY");
      places.put(new Integer(135), "Secaucus, NJ");           
      places.put(new Integer(419), "Sparks, NV");           
      places.put(new Integer(136), "St. Louis, MO");           
      places.put(new Integer(430), "St. Paul, MN");           
      places.put(new Integer(137), "State College, PA");           
      places.put(new Integer(138), "Storrs, CT");           
      places.put(new Integer(139), "Syracuse, NY");           
      places.put(new Integer(140), "Toledo, OH");           
      places.put(new Integer(145), "Toronto, ON");
      places.put(new Integer(142), "Washington, DC");
      places.put(407, "Texarkana, AR");
      places.put(92, "Atlantic City, NJ");
      }
 
  
  public String get(Integer i){
    return places.get(i);
  }

}