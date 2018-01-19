/*
 *    Author : Mihir Patel
 *      Date : 1/17/18
 *      Desc : Determine the lowest TriangularNumber with TARGET divisors.
 *   Problem : 12
 */
public class HighlyDivisibleTriangularNumber 
{
	/* ------------------------ main() ------------------------- */
    public static void main (String [] args)
    {
    	final int TARGET_DIVS = 500;
    	long n = 1;
    	while(true)
    	{
    		long triangularNumber = (n * (n + 1)) / 2;
    		if (numOfDivisors(triangularNumber) > TARGET_DIVS)
    		{
    			System.out.println(triangularNumber);
    			break;
    		}
    		n++;
    	}
    	
    }
    
    /* ----------------- numOfDivisors() ----------------------- */
    public static long numOfDivisors(long num)
    {
    	// brute force method
    	int sqrt = (int)Math.sqrt(num);
    	long divisors = 0;
    	for (long i = 1; i < sqrt; i++)
    	{
    		if (num % i == 0)
    		{
    			// increment by 2 because we have two divisors i and (num / i)
    			divisors += 2;
    		}
    	}
    	
    	return divisors;
    }
}
