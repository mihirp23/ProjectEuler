/*
 * Author : Mihir Patel
 *   Date : 1/15/18
 *   Desc : Calculate the sum of the primes below the provided MAX_LIMIT.
 */

public class SumOfPrimes 
{
	/* ----------------------------- main() ------------------------------- */
    public static void main (String [] args)
    {
    	final int MAX_LIMIT = 2000000;
    	long sum = 0;
    	for (int n = 2; n < MAX_LIMIT; n++)
    	{
    		if (isNumPrime(n))
    		{
    			sum += n;
    		}
    	}
    	System.out.println(sum);
    	
    }
    
    /* ---------------------------- isNumPrime() ----------------------- */
    public static boolean isNumPrime(long num)
    {
    	// 2 and 3 are known primes
    	if (num == 2 || num == 3)
    	{
    		return true;
    	}
    	
    	// even numbers and numbers less than 2 are NOT prime
    	if (num < 2 || num % 2 == 0)
    	{
    		return false;
    	}
    	
    	// brute force to check all odd numbers from 3 to sqrt(num) 
    	for (long i = 3; i <= (int)Math.sqrt(num); i += 2)
    	{
    		if (num % i == 0)
    		{
    			return false;
    		}
    	}
    	
    	// at this point, we can assume the number is prime
    	return true;
    }
}
