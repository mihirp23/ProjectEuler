/*
 *    Author : Mihir Patel
 *      Date : 1/9/18
 *      Desc : Determine the largest prime factor of NUM 
 *   Problem : 3
 */

public class LargestPrimeFactor {
	
	/* --------------------------- main() ------------------- */
	public static void main (String [] args) 
	{
		final long NUM = 600851475143L;
		System.out.println(getLargestPrime(NUM));
	}
	
	/* ------------------------- getLargestPrime -------------- */
	public static long getLargestPrime(long n)
	{
		long i;
		
		// iteratively divide by the number of its factor 
		// to get the prime number
		for (i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				n = n / i;
				i = i - 1;
			}
		}
		return i;
	}
	

}
