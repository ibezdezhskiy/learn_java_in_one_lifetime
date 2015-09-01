import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

/**
The purpose of this problem is to verify whether the method you are using to read input 
data is sufficiently fast to handle problems branded with the enormous Input/Output warning. 
You are expected to be able to process at least 2.5MB of input data per second at runtime.

Input

The input begins with two positive integers n k (n, k<=10^7). 
The next n lines of input contain one positive integer ti, not greater than 10^9, each.
Output

Write a single integer to output, denoting how many integers ti are divisible by k.
Example

Input:
7 3
1
51
966369
7
9
999996
11

Output:
4
 * @param <T>
 */
public class CodeChef3 
{
	static Scanner scanner = new Scanner(System.in);
	static long numLines;
	static long divisor;
	static long divisibles;
	static List<Long> numList = new ArrayList<Long>();

	public static void main (String[] args)
	{	
		numLines = scanner.nextLong();
		divisor = scanner.nextLong();
				
		for(int i = 0; i < numLines; i++)
			{
				numList.add(scanner.nextLong());
			}
		scanner.close();
		
		divisibles = doMath(numLines, divisor, numList);
		System.out.println(divisibles);
	}

	
	private static long doMath(long theNumLines, long theDivisor, List<Long> theNumList)
	{
		long myDivisibles = 0;
		
		for(long eachLong : theNumList)
		{
			if(eachLong % theDivisor == 0)
			{
				myDivisibles ++;
			}
		}
		return myDivisibles;
	}
	
}
