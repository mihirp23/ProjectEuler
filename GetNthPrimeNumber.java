/*
 * Author : Mihir Patel
 *   Date : 1/11/18
 *   Desc : Determine NTH prime number.
 */
public class GetNthPrimeNumber 
{
	/* ----------------------------- main() ------------------------- */
    public static void main (String [] args)
    {
    	final int NTH = 1001;
    	int primeCounter = 0;
    	long currentNumber = 2;
    	while (primeCounter < NTH)
    	{
    		if (isPrime(currentNumber))
    		{
    			primeCounter++;
    		}
    		currentNumber++;
    	}
    	
    	System.out.println(currentNumber - 1);
    }
    
    /* -------------------------- isPrime() --------------------------------- */
    public static boolean isPrime(long n)
    {
    	// 1 and 2 are known primes
    	if (n == 1 || n == 2)
    	{
    	    return true;
    	}
    	
    	// negative numbers and even numbers are not primes
    	if (n < 1 || n % 2 == 0)
    	{
            return false;
    	}
    	
    	// brute force to determine primality by trying to divide the 
    	// number evenly with all positive integers less than n
    	for (long i = 3; i < n; i++)
    	{
    		if (n % i == 0)
    		{
    			return false;
    		}
    	}
    	
    	// at this point, assume the number is prime
    	return true;
    }
}
