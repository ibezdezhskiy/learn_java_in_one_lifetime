package euler;
/**
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

/* 
 * Thinking out loud:
 * 
 * There are a bunch of tests, each specific to whether a number is divisible by another small factor.
 * The brute force method is iterating through all the numbers until some unreasonably huge value
 * in order to figure out the result.
 * 
 * So:
 * For each number from 0 to 100000 (let's say) check:
 * Is number divisible by 2? If so, pass on to next check:
 * 	Is number divisible by 3? If so, pass on to next check:
 * 		Is number divisible by 4?  and so on and so forth...
 * 		...
 * 			Is number divisible by 20?
 * 
 * If not, iterate number.
 * My hope is by nesting the checks (instead of doing a single-line call for all of them) 
 * I'll move through the numbers slightly faster.
 * 
 * Kitchen thought: 
 * I can do the "is it divisible by X?" in a loop as well.
 * So, for number i, check if it's evenly divisible by number j (up to 20). 
 * If true, and i is smaller than the previous smallest number, set that as the number. Iterate through all i.
 * Outcome: Hm, seems like it iterates through all of j even if it fails on the first one. How do I eliminate the rest?
 * 
 * Looking at math suggestions, it seems like the j range can be shortened. 
 * Instead of: [2, 3, 4, 5, 6, 7, 8 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 * Remove 2, 4, 5, and 10 if we allow 20 to stay.
 * Remove 6 and 3 if 18 is staying.
 * Remove 7 if 14 is staying.
 * Remove 9 if we leave in 18, as well.
 * Left with [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 * Maybe throw in 2520 since it's evenly divisible into 1-10?  Not necessary.
 */


public class Euler5 {

	public static void main(String[] args)
	{
		int result;
		result = getNum();
		System.out.println(result);
	}

	static public int getNum()
	{
		int smallestNum = 0;
		int[] divisors = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int i = 1; i < 1000000000; i++)
		{
			for(int j : divisors)
				{
					if(isDivisibleBy(i, j))
					{
						if(j == 20){
							smallestNum = i;
							return smallestNum;
						}
					}
					else
					{
						break;
					}
				}
			}
		return smallestNum;
		}
	
	static public boolean isDivisibleBy(int i, int j)
	{
		if(i % j == 0)
		{
			return true;
		}
		else
			return false;
	}
}
