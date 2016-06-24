/**
 * Prabhat RANJAN
 * Software Testing and Metrics
 * Telecom SudParis
 * 
 * */

package tower;

public class TowerOfHanoi {
	public static String str="";	   
	public static String solve(int discs, String start, String auxiliary, String end) {
		       
			   if (discs == 1) {
		           str = str+"| "+ start + " -> " + end;
		       } else {
		           solve(discs - 1, start, end, auxiliary);
		           str = str+"| "+ start + " -> " + end;
		           solve(discs - 1, auxiliary, start, end);
		       }
			return str;
		   }
		   public static void main (String[] args) 
		   {
		       System.out.println(TowerOfHanoi.solve(3, "A", "B", "C"));
		   }
	}