/*
 * Author : Mihir Patel
 *   Date : 1/10/18
 *   Desc : Determine the smallest positive number that is evenly 
 *          divisible by all of the numbers from RANGE_START and RANGE_END.
 */
public class SmallestMultiple 
{
	/* ------------------------------- main() --------------------------------- */
	public static void main (String [] args) 
	{
		// specify range
		final long RANGE_START = 1;
		final long RANGE_END = 20;
		
		// brute force method for finding the least common multiple
		long currentNumber = RANGE_END + 1;
		while (true)
		{
			if (isNumberDivisibleByRange(currentNumber,RANGE_START, RANGE_END))
			{
				System.out.println(currentNumber);
				break;
			}
			else 
			{
				currentNumber++;
				continue;
			}
		}
	}
	
	/* ----------------------- isNumberDivisibleByRange() ----------------------------- */
	public static boolean isNumberDivisibleByRange(long number, long rangeS, long rangeE) {
		for (long i = rangeS; i < rangeE; i++) 
		{
			if (number % i == 0)
			{
				continue;
			}
			else 
			{
				return false;
			}
		}
		return true;
	}
}
