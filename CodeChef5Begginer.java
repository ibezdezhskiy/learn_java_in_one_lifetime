import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
Given an array A of length N, your task is to find the element which repeats in A maximum number of times as well
 as the corresponding count. In case of ties, choose the smaller element first.
Input

First line of input contains an integer T, denoting the number of test cases. 
Then follows description of T cases. Each case begins with a single integer N, the length of A. 
Then follow N space separated integers in next line. 
Assume that 1 <= T <= 100, 1 <= N <= 100 and for all i in [1..N] : 1 <= A[i] <= 10000
Output

For each test case, output two space separated integers V & C. V is the value which occurs maximum number of times and C is its count.
Example

Input:
2
5
1 2 3 2 5
6
1 2 2 1 1 2

Output:
2 2
1 3

Description:
In first case 2 occurs twice whereas all other elements occur only once. 
In second case, both 1 and 2 occur 3 times but 1 is smaller than 2.
 */
public class CodeChef5Begginer
{
	static Scanner scanner = new Scanner(System.in);
	static List<Integer> listOfN = new ArrayList<Integer>();
	static HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
	
	public static void main(String[] args)
	{
		int numTests = scanner.nextInt();
		
		//build an array of all the numbers passed by the user
		for(int i = 0; i < numTests; i++)
		{
			listOfN.clear();
			int arrayLength = scanner.nextInt();
			
			for(int j = 0; j < arrayLength; j++)
			{
				Integer nextInt = scanner.nextInt();
				listOfN.add(j, nextInt);
			}
			
			String answer = getFrequency(listOfN);			
			System.out.println(answer);
		}
	}

	static private String getFrequency(List<Integer> listOfN)
	{
		int highestFrequency = 0;
		int mostFrequentNum = 0;
		int temp = 0;
		String answer = "";
		
		for(int k = 0; k < listOfN.size(); k++)
		{
			temp = Collections.frequency(listOfN, listOfN.get(k));
			if(temp > highestFrequency)
			{
				highestFrequency = temp;
				mostFrequentNum = listOfN.get(k);
				answer = mostFrequentNum + " " + highestFrequency;
			}
		}
	return 	answer;
	}

}
