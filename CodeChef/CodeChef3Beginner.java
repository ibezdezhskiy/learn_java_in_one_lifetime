import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 The chef has just finished baking several pies, and it's time to place them on cooling racks.
The chef has exactly as many cooling racks as pies. 
Each cooling rack can only hold one pie, and each pie may only be held by one cooling rack,
but the chef isn't confident that the cooling racks can support the weight of the pies.
The chef knows the weight of each pie,
and has assigned each cooling rack a maximum weight limit.
What is the maximum number of pies the chef can cool on the racks?
Input:

Input begins with an integer T≤30, the number of test cases.
Each test case consists of 3 lines.
The first line of each test case contains a positive integer N≤30,
the number of pies (and also the number of racks).
The second and third lines each contain exactly positive N integers not exceeding 100.
The integers on the second line are the weights of the pies, and the integers on the third line
are the weight limits of the cooling racks.
Output:

For each test case, output on a line the maximum number of pies the chef can place on the racks.
Sample input:

2
3
10 30 20
30 10 20
5
9 7 16 4 8
8 3 14 10 10
 

Sample output:

3
4
 
 */


/*
 * Thinking out loud:
 * 
 * New mechanic: reading multiple lines and multiple numbers?
 * 
 * NumTests is easy.
 * NumPies is next, controls number of integers on lines 2 and 3.
 * Then math - For each entered number, check if following line has number <= to it. 
 * Except, I have to put the numbers into an array and search through all from smallest to largest so as not to miss one.
 * 
 * How do I do a comparison of each index in an array to every other index in an array? 
 * Well, problem is, I'm not looking for equality or something simple.
 * 
 */


public class CodeChef3Beginner
{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int numTests = scanner.nextInt();
		List<Integer> pies = new ArrayList<Integer>();
		List<Integer> racks = new ArrayList<Integer>();

		
		for(int i = 0; i < numTests; i++)
		{
			int numPies = scanner.nextInt();
			//clean up arrays of pies/racks before each test
			pies.clear();
			racks.clear();
			int supportedPies = 0;
			
			for(int j = 0; j < numPies; j++ )
			{
				pies.add(scanner.nextInt());
			}
			for(int k = 0 ; k < numPies; k ++)
			{
				racks.add(scanner.nextInt());
			}
			
			Collections.sort(pies);
			Collections.sort(racks);
//			System.out.println(pies);
//			System.out.println(racks);
			
			for(int pie : pies)
			{
				for(int l = 0; l < racks.size(); l++)
				{
					if(pie <= racks.get(l))
					{
						supportedPies++;
						racks.remove(l);
						break;
					}
					else
					{
						continue;
					}
				}
			}
			System.out.println(supportedPies);
		}
		scanner.close();
	}
}
