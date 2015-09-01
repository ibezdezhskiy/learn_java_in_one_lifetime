package euler;
/**
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Euler9
{

	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(a = 0; a < 1000; a++)
		{
			for(b = 0; b < 1000; b++)
				{
					for(c = 0; c < 1000; c++)
						{
							if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
								{
									if(a + b + c == 1000)
										{
											if(a < b && b < c)
												{
													System.out.println("a = " + a);
													System.out.println("b = " + b);
													System.out.println("c = " + c);
													System.out.println("a*b*c = " + a*b*c);
												}
										}
								}
						}
				}
		}

	}
}
