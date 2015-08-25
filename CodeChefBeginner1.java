import java.util.Scanner;

/**
 * Problem 1: 
 * Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. 
 * More precisely... rewrite small numbers from input to output. 
 * Stop processing input after reading in the number 42. 
 * All numbers at input are integers of one or two digits.
 * Example:
 *Input:
 *1
 *2
 *88
 *42
 *99
 *
 *Output:
 *1
 *2
 *88
 * @author ilyab
 *
 */
public class CodeChef1 
{

	public static void main(String[] args)
	{
		Scanner lineScanner = new Scanner(System.in);
		
		while(true)
		{
			int input = lineScanner.nextInt();
			if(input != 42)
			{
				System.out.println(input);
				lineScanner.nextLine();
			}
			else
				break;
		}
		lineScanner.close();	}
}
