import java.util.Scanner;

/**
The palindrome is a string that can be read the same way from left to right and from right to left. 
For example, strings "aaaaa", "1221", "bbaabb" are palindromes, however the string "chef" is not a palindrome because 
if we read it from right to left, we will obtain "fehc" that is not the same as "chef".

We call a string a "double string" if it has an even length and the first half of this string is equal 
to the second half of this string, for example "abab" is a double string because the first half "ab" is equal 
to the second half "ab", however the string "abba" is not a double string because the first half "ab" is not equal 
to the second half "ba". The empty string "" is a double string, and its length is 0.

Chef doesn't like palindromes, however he likes "double strings". 
He often likes to change the order of letters in some palindrome and sometimes to remove some symbols from it. 
Now he wonders: if a palindrome of length N is given, what is the maximal possible number of characters in a "double string"
that can be obtained by removing and changing the order of symbols in it?
Input

Several test cases are given.
The first line of the sample input contains an integer T - the number of test cases.
Then, T lines follow.
Each line consists of a single integer N - the length of a palindrome.
Output

For each test case output a single integer - answer to the problem.
Constraints

    1<=T<=10000
    1<=N<=1000000000

Example

Input:
2
2
4

Output:
2
4
 */

/*
 * Thinking out loud: This seems hard, but shouldn't be.  What it's asking for:
 * 
 * If I give you a string of characters, how many of those characters are the same? If I re-arrange the second half of a palindrome like 
 * "amanaplanacanalpanama" can I end up with "amanaplana amanaplana" with 'c' removed? Basically, a palindrome with an even number of
 * letters is always equal-length to what it used to be, while a palindrome with an odd number of letters is length()-1 in size.
 * 
 * Enhancements: Should I check for whether the string given is a palindrome?  Should I just do a sum of the numer of characters in a
 * given string, subtract 1 if odd, and return the result?
 * 
 *Should I even check for the length of T and N?
 */


public class CodeChef2Beginner
{
	static Scanner scanner = new Scanner(System.in);
	static int numLines = scanner.nextInt();
	static Scanner palindromeReader = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		if(numLines < 10000)
		{
			for(int i = 0; i < numLines; i++)
			{
				String palindrome = palindromeReader.nextLine();
				
				if(palindrome.length() < 1000000000 && palindrome.length() % 2 != 0)
				{
					System.out.println(palindrome.length() -1);
				}
				if(palindrome.length() < 1000000000 && palindrome.length() % 2 == 0)
				{
					System.out.println(palindrome.length());
				}
			}
		}
		else
		{
			System.out.println("Too many tests at once. Reduce test number for my tiny brain!");
		}
		
		palindromeReader.close();
		scanner.close();
	}
}

