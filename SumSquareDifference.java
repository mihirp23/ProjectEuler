/*
 * Author : Mihir Patel
 *   Date : 1/10/18
 *   Desc : Finds the difference between the sum of the squares of the first 
 *          one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference 
{
    public static void main (String [] args)
    {

    	final int LIMIT = 100;
    	
    	int sumOfSquares = 0;
    	for (int i = 1; i <= LIMIT; i++)
    	{
    		sumOfSquares += i * i;
    	}
    	// to calculate the sum of 1 to n, use formulat (n*(n+1))/2
    	double squareOfSum = (LIMIT * (LIMIT + 1)) / 2;
    	squareOfSum *= squareOfSum;
    	double sumSquareDifference = squareOfSum - sumOfSquares;
    	System.out.println(sumSquareDifference);
    }
}
