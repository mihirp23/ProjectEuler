/*
 *    Name : Mihir Patel
 *    Date : 1/28/18
 *    Desc : Calculate the sum of all the multiples of 3 or 5 below 1000.
 * Problem : 1
 */
public class Multiples {
	public static void main (String [] args) {
		
		// running total 
		int sum = 0;
		
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
