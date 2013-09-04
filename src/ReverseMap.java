import java.util.HashMap;
public class ReverseMap{
  protected HashMap<String,Integer> places;// change to private if not needed
  protected int[] locations = {296,331,110,111,112,318,115,116,295,117,118,417,408,324,390,298,300,
	  119,120,121,144,294,293,299,291,305,122,303,
	  123,389,413,126,297,127,128,129,304,130,418,
	  132,133,416,134,415,321,414,412,301,135,419,136,430,137,138,139,140,145,142};;
  public ReverseMap(){
    places = new HashMap<String,Integer>();
      places.put("Albany, NY",89);
      places.put("Amherst, MA", 90);
      places.put("Ann Arbor, MI",91 );
      places.put("Athens, GA",302);
      places.put("Atlanta, GA",289);
      places.put("Austin, TX",320);
      places.put("Baltimore, MD",143);
      places.put("Binghamton, NY",93);
      places.put("Birmingham, AL",292);          
      places.put("Boston, MA",94);
      places.put("Buffalo Airport, NY",273);
      places.put("Buffalo, NY",95);
      places.put("Burlington, VT",96);
      places.put("Champaign, IL",98);
      places.put("Charlotte, NC",99);
      places.put("Chattanooga, TN",290);
      places.put("Chicago, IL",100);           
      places.put("Christiansburg, VA",101);           
      places.put("Cincinnati, OH",102);           
      places.put("Cleveland, OH",103);           
      places.put("Columbia, MO",104);           
      places.put("Columbus, OH",105);           
      places.put("Dallas/Fort Worth, TX",317);           
      places.put("Des Moines, IA",106);           
      places.put("Detroit, MI",107);           
      places.put("Durham, NC",131);           
      places.put("East Lansing, MI",330);           
      places.put("Erie, PA",108);           
      places.put("Fairhaven, MA",316);           
      places.put("Gainesville, FL",296);           
      places.put("Grand Rapids, MI",331);           
      places.put("Hampton, VA",110);           
      places.put("Harrisburg, PA",111);           
      places.put("Hartford, CT",112);           
      places.put("Houston, TX",318);           
      places.put("Indianapolis, IN",115);           
      places.put("Iowa City, IA",116);           
      places.put("Jacksonville, FL",295);
      places.put("Kansas City, MO",117);           
      places.put("Knoxville, TN",118);           
      places.put("Las Vegas, NV",417);           
      places.put("Lexington, KY",408);           
      places.put("Little Rock, AR",324);           
      places.put("Los Angeles, CA",390);           
      places.put("Louisville, KY",298);           
      places.put("Madison, U of Wisc, WI",300);           
      places.put("Madison, WI",119);           
      places.put("Memphis, TN",120);           
      places.put("Milwaukee, WI",121);           
      places.put("Minneapolis, MN",144);           
      places.put("Mobile, AL",294);           
      places.put("Montgomery, AL",293);           
      places.put("Nashville, TN",291);           
      places.put("Morgantown, WV",299);           
      places.put("New Brunswick, NJ",305);           
      places.put("New Haven, CT",122);           
      places.put("New Orleans, LA",303);           
      places.put("New York, NY",123);           
      places.put("Newark, DE",389);           
      places.put("Oakland, CA",413);           
      places.put("Omaha, NE",126);           
      places.put("Orlando, FL",297);           
      places.put("Philadelphia, PA",127);           
      places.put("Pittsburgh, PA",128);           
      places.put("Portland, ME",129);           
      places.put("Princeton, NJ",304);           
      places.put("Providence, RI",130);           
      places.put("Reno, NV",418);           
      places.put("Richmond, VA",132);
      places.put("Ridgewood, NJ",133);
      places.put("Riverside, CA",416);
      places.put( "Rochester, NY",134);
      places.put("Sacramento, CA",415);
      places.put("San Antonio, TX",321);
      places.put("San Francisco, CA",414);
      places.put("San Jose, CA",412);
      places.put("Saratoga Springs, NY",301);
      places.put("Secaucus, NJ",135);           
      places.put("Sparks, NV",419);           
      places.put("St. Louis, MO",136);           
      places.put("St. Paul, MN",430);           
      places.put("State College, PA",137);           
      places.put("Storrs, CT",138);           
      places.put("Syracuse, NY",139);           
      places.put("Toledo, OH",140);           
      places.put("Toronto, ON",145);
      places.put("Washington, DC",142);
      places.put("Texarkana, AR", 407);
      places.put("Atlantic City,  NJ", 92);
      }
 
  
  public Integer get(String s){
    return places.get(s);
  }
}
