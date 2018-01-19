/*
 *    Author : Mihir Patel
 *      Date : 1/9/18
 *      Desc : Determines the largest palindrome made from the 
 *             product of two 3-digit numbers.
 *   Problem : 4
 */
public class LargestPalindromeProduct {
	/* --------------------------- main() ------------------------------ */
	public static void main (String [] args) 
	{
		int maxProduct = 1;
		for (int i = 1000; i >= 100; i--) 
		{
			for (int j = 1000; j >= 100; j--)
			{
				int product = i * j;
				if (isPalindrome(String.valueOf(product)))
				{
					if (product > maxProduct)
					{
						maxProduct = product;
					}
				}
			}
		}
		
		System.out.println(maxProduct);
	}
	
	/* ------------------- isPalindrome() -------------------------- */
	public static boolean isPalindrome (String str)
	{
		String rev = new StringBuilder(str).reverse().toString();
		return (rev.equals(str));
	}


}
