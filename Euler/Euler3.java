/**
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
public class Euler3 {

	public static void main(String[] args) 
	{	
		int prime1 = 1;
		Long bigNum = 600_851_475_143L;
		
		for(int n = 1; n < 10000001; n++)
		{
			//Leonhard Euler's formula for calculating primes from https://en.wikipedia.org/wiki/Formula_for_primes
			int primeFormula = (int)(Math.pow(n, 2) + n + 41); 
			if(bigNum % primeFormula == 0 && primeFormula > prime1)
			{
				prime1 = primeFormula;
			}
		}
		System.out.println(prime1);
	}

}
