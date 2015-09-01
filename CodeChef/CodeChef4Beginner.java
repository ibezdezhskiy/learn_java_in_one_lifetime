import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
In Ciel's restaurant, a waiter is training.
Since the waiter isn't good at arithmetic, sometimes he gives guests wrong change.
Ciel gives him a simple problem.
What is A-B (A minus B) ?

Surprisingly, his answer is wrong.
To be more precise, his answer has exactly one wrong digit.
Can you imagine this?
Can you make the same mistake in this problem?
Input

An input contains 2 integers A and B.
Output

Print a wrong answer of A-B.
Your answer must be a positive integer containing the same number of digits as the correct answer, 
and exactly one digit must differ from the correct answer.
Leading zeros are not allowed.
If there are multiple answers satisfying the above conditions, anyone will do.
Constraints

1 ≤ B < A ≤ 10000
Sample Input

5858 1234

Sample Output

1624

Output details

The correct answer of 5858-1234 is 4624.
So, for instance, 2624, 4324, 4623, 4604 and 4629 will be accepted, but 0624, 624, 5858, 4624 and 04624 will be rejected.
Notes

The problem setter is also not good at arithmetic. 
 */

/*
 * Thinking out loud:
 * 
 * Honestly, the first thing that comes to mind is "do A-B" then "get correct answer in an array" and 
 * "randomize one of the numbers and print the answer" with conditions to check for index 0 never being a zero 
 * to fill the "no leading 0s" condition.
 * 
 * 
 */
public class CodeChef4Beginner
{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		//move answer from an int into a String and then into an Integer array so I can replace individual digits.
		Integer answer = a - b;
		String randomAnswer = answer.toString();
		Integer[] answerArray = new Integer[randomAnswer.length()];
		Random randomizer = new Random();
		int randomInt = randomizer.nextInt(10);
		
		for(int i = 0; i < randomAnswer.length() ; i ++)
		{
			answerArray[i] = randomAnswer.charAt(i) - '0';
		}
		
		//scramble a digit, then check that the number doesn't get randomized into the same number it used to be
		
			do while(Arrays.equals(randomAnswer.toCharArray(), answerArray.toString().toCharArray())) 
			{
				answerArray[randomizer.nextInt(randomAnswer.length() - 1)] = randomInt;
			}

		//check that leading number isn't a zero, change it if it is
		while(answerArray[0] == 0);
		{
			answerArray[0] = randomizer.nextInt(10);
		}
		
		//print array out as a single string
		for(int j = 0; j < answerArray.length ; j++)
		{
			System.out.print(answerArray[j]);
		}
		scanner.close();
	}
}
