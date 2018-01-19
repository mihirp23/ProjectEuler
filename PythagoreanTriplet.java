/*
 *    Author : Mihir Patel
 *      Date : 1/15/18
 *      Desc : Determine the Pythagorean triplet for which a + b + c 
 *             is equal to the specified TARGET. Pythagorean triplet
 *             is a set of three natural numbers a < b < c for
 *             which (a^2) + (b^2) = (c^2).
 *   Problem : 9
 */
public class PythagoreanTriplet
{
	/* -------------------------- main() ------------------------------ */
    public static void main (String [] args)
    {
    	final int TARGET = 1000;
        for (int a = 1; a < TARGET; a++)
        {
        	for (int b = a; b < TARGET - a; b++)
        	{
        		for (int c = b; c < TARGET - b; c++)
        		{
        			if (a + b + c == TARGET && ((a * a) + (b * b) == (c *c)))
        			{
        				System.out.println(a);
        				System.out.println(b);
        				System.out.println(c);
        			}
        		}
        	}
        }
        
    }
}
