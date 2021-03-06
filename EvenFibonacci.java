/*
 *    Author : Mihir Patel
 *      Date : 1/9/18
 *      Desc : By considering the terms in the Fibonnaci Sequence
 *             whose values do not exceed four million, find the 
 *             sum of even-valued terms.
 *   Problem : 2
 */
public class EvenFibonacci {
	/* ------------------------------- main() ------------------------------ */
	public static void main (String [] args) 
	{
	    
		final int MAX = 4000000;
		
		// running sum
		int sum = 0; 
		
		// iterating variable
		int i = 1;
		
		// first fibonacci number
		int fib = fibonacci(i);
		
		// iterate through first 4 million numbers in the fibonacci sequence
		while (fib < MAX) 
		{
			// even number
			if (fib % 2 == 0) 
			{
				sum = sum + fib;
			}
			// get next number in the fibonnaci sequence
                        i = i + 1;
                        fib = fibonacci(i);
		}
		
		// display the computed sum
		System.out.println(sum);
	    
	}
	
	/* ------------------------------- fibonacci() ------------------------------ */
	public static int fibonacci(int n) 
	{
		if (n == 0 || n == 1) 
		{
			return 1;
		}
		else 
		{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
