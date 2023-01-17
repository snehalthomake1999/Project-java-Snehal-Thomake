package whileloop;

public class each {
	public static void main(String[] args) {
		
	    for (int a= 1; a <= 3; a++) {
	    	 System.out.println(" my calendar");
	      System.out.println("year: " + (a+2010)); 
	      
	     
	      String[] month = {"jan", "feb", "march"};
	      for (String b: month) {
	        System.out.println("month:" +b);
	       
		      String[] d = {"week 1", "week 2", "week 3","week 4"};
		      for (String e: d) {
		        System.out.println(e );
		       
	      
	        String[] WEEK = {"day 1 :Sunday", "day 2 :Monday", "day 3 :Tuesday","day 4 :Wednesday","day 5 :Thuesday","day 6:Friday","day 7:Saturday"};
		      for (String c: WEEK) {
		        System.out.println( c);
		        
	        }
	      }
	    } 
	  }
	}
}
