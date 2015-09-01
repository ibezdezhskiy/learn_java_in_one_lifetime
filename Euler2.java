/**
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 */
public class Euler2 {

	public static void main(String[] args) 
	{
		long fib1 = 1;
		long fib2 = 2;
		long sumEvens = 2;
		
			while( fib1 < 4000000 && fib2 < 4000000)
			{
				fib1 += fib2;
				if(fib1 % 2 == 0) 
				{
					sumEvens += fib1;
				}
				fib2 += fib1;
				if(fib2 % 2 == 0)
				{
					sumEvens += fib2;
				}
			}
			
		System.out.println(sumEvens);
	}

}
