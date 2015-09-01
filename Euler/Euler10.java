import java.util.ArrayList;
import java.util.HashMap;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Euler10
{
	public static void main(String[] args)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		HashMap<Integer, Boolean> rangeOfNums = new HashMap<Integer, Boolean>();
		int output = 0;
		
		//create array of numbers
		for(Integer i = 2; i < 2000000; i++)
		{
			rangeOfNums.put(i, true);
		}
		
		//sieve numbers, set primes to true
		for(Integer j = 2; j < Math.sqrt(2000000); j ++)
		{
			if(rangeOfNums.get(j) == true)
			{
				for(Integer k = (int)Math.pow(j, 2); k < 2000001; k+=j)
					{
						rangeOfNums.put(k, false);
					}
			}
		}
		//add true values into array of primes
		for(int eachKey = 2; eachKey < rangeOfNums.size(); eachKey ++)
		{
			if(rangeOfNums.get(eachKey) == true)
			{
				primes.add(eachKey);
			}
		}
		//add up all the prime numbers
		for(int prime : primes)
		{
			output += prime;
		}
		System.out.println(output);
	}
}
