package euler;
import java.util.ArrayList;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */

/*
 * Improvements needed: What is I don't know the number of a prime? 
 * What if I don't know ultimately how large the number range is?
 * Going by "Xth prime" is not reliable predictor for the number range. 
 * Sieve of Eratosthenes requires knowing the number range. 
 * I guess impossibly large is an option, but past ten million digits we're going to slow down.
 */
public class Euler7
{

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();  
		ArrayList<Integer> primesArray = new ArrayList<Integer>();
		
		while(primesArray.size() < 9996)
		{
			for(int prime = 17; prime < 100000; prime++)
			{
				int divisors[] = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
				int counter = 0;
				
				for(int divisor : divisors)
				{
					if(prime % divisor != 0 && prime % 1 == 0 && prime % prime == 0 )
					{
						counter ++;
						if(counter >= divisors.length)
						{
							primesArray.add(prime);
						}
					}
					
				}
			}
		}
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println("The 10001st prime number is " + primesArray.get(9995));
		System.out.println("Time taken: " + endTime / 1000 + " seconds"); 
	}

}
