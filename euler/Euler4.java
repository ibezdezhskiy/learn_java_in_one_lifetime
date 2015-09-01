package euler;
/**
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */


/*
 * Thinking out loud:
 * A palindrome of two 3-digit numbers can be either 5 or 6 characters in length.
 * The first half (2 or 3 characters) of the palindrome should be identical to the inverse of the second half.
 * Ex: 615516 is a palindrome where 6-1-5 and 5-1-6 are mirrors.
 * If converted into a string, string.char[0] should equal string.char[length()]
 * The palindrome has to be a product of X and Y (palindrome = X*Y)
 * 
 * 
 * Brute force method: 
 * Take smallest X and smallest Y numbers where length of X is 3 and:
 * Set up two incrementing counters (i and j)
 * For i = 0 and j = 0
 * Multiply X*Y to get a potential palindrome.
 * Convert potential palindrome to String.
 *
 * 		If String length() is % 5 = 0 (if it's 5 characters long)
 * 		Check that for index i, String[0] is the same value as String[length()-i] up to i == length/2-1.
 * 		If it is a palindrome, check whether it's larger than the original value of this palindrome (starting with 0).
 * 		Replace biggest value with original.
 * 	
 * 		If String length % 2 = 0 (even numbered length)
 * 		Check that for index i, String[0] is the same value as String[length()-i] up to i == length/2.
 * 		If it is a palindrome, check whether it's larger than the original value of this palindrome (starting with 0).
 * 		Replace biggest value with original.
 * 
 * Increase X by 1, keep Y the same, continue doing the check. 
 * When length of X is no longer 3, reset to base (100), increase X by 1
 * and increment through Y until Y.length() > 3 
 * 
 * 
 */

public class Euler4 {

	public static void main(String[] args)
	{
		Integer x = 999;
		Integer y = 999;
		
		String palindrome = getPalindrome(x, y).toString();
		System.out.println(palindrome);
	}

	static private Integer getPalindrome(int num1, int num2)
	{
		Integer product = num1 * num2;
		int palindromeLength = product.toString().length();
		String palindrome = product.toString();
		Integer biggestPalindrome = 111111;
		
		for(int i = 999; i > 100; i--)
		{
			num1 = i;
			System.out.println("i is now " + i);
			for(int j = 999; j > 100; j--)
			{
				num2 = j;
				product = num1*num2;
				palindromeLength = product.toString().length();
				System.out.println("j is now " + j);
				if(palindromeLength % 5 == 0)
				{
					product = num1 * num2;
					palindrome = product.toString();
					short matchedChars = 0;
					
					for(int k = 0; k < (palindrome.length() - 1) / 2; k++)
					{
						Character frontChar = palindrome.charAt(k);
						Character backChar = palindrome.charAt((palindrome.length() - 1) - k);
						
						if(frontChar.equals(backChar) && matchedChars != 2)
						{
							matchedChars ++;
							if(matchedChars == 2)
							{
								if(biggestPalindrome < product)
								{
									biggestPalindrome = product;
								}
								
							}
						}
					}
				}
				if(palindromeLength % 2 == 0)
				{
					product = num1 * num2;
					palindrome = product.toString();
					short matchedChars = 0;
					for(int k = 0; k < (palindrome.length()/2); k++)
					{
						Character frontChar = palindrome.charAt(k);
						Character backChar = palindrome.charAt((palindrome.length() - 1) - k);
						if(frontChar.equals(backChar) && matchedChars != 3)
						{
							matchedChars++;
							if(matchedChars == 3)
							{
								if(biggestPalindrome < product)
								{
									biggestPalindrome = product;
								}
							}
						}
					}
				}
			}
		}
		return biggestPalindrome;
	}
}
