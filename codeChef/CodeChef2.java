import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Pooja would like to withdraw X $US from an ATM. 
 * The cash machine will only accept the transaction if X is a multiple of 5, 
 * and Pooja's account balance has enough cash to perform the withdrawal 
 * transaction (including bank charges). 
 * For each successful withdrawal the bank charges 0.50 $US.

Calculate Pooja's account balance after an attempted transaction.
Input

Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.

Nonnegative number 0<= Y <= 2000 with two digits of precision - 
Pooja's initial account balance.

Output

Output the account balance after the attempted transaction, 
given as a number with two digits of precision. 
If there is not enough money in the account to complete the transaction, 
output the current bank balance.

Example - Successful Transaction

Input:
30 120.00

Output:
89.50

Example - Incorrect Withdrawal Amount (not multiple of 5)

Input:
42 120.00

Output:
120.00

Example - Insufficient Funds

Input:
300 120.00

Output:
120.00

 * @author ilyab
 *
 */

public class CodeChef2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in).useDelimiter("\\s");
		
		while(true)
		{
			if(input.hasNext())
				{
				int withdrawal = input.nextInt();
				double balance = input.nextDouble();
				String output;
			
				output = processTransaction(withdrawal, balance);
				
				System.out.println(output);
				break;
				}
		}
		input.close();
	}
	
	public static String processTransaction(int theWithdrawal, double theBalance) 
	{
		double myFee = 0.50;
		
		int myWithdrawal = theWithdrawal;
		double myBalance = theBalance;
		double myOutput = theBalance;
		
		if (myBalance > 0 && myBalance <= 2000 && myWithdrawal > 1 && myWithdrawal <= 2000 && myBalance-myWithdrawal > 0 && myWithdrawal%5 == 0)
		{
					myOutput = (myBalance-myWithdrawal)-myFee;
		}
		
		//making output stick to the two-decimal place formatting
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(myOutput);
	}
}