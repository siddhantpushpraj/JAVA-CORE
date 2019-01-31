package loops;

import java.util.Scanner;

public class CalculateInterestRate {
	public static void main(String[] args)
	{
		System.out.println("enetr Amount");
		double amount=getValue();
		//System.out.println("enetr any rate");
		//double rate=getValue();
		for(int rate=2;rate<9;rate++)
			System.out.println( amount + " at " + rate + "% interset rate = " +calculateInterest(amount,rate));
	}
	public static double calculateInterest(double amount,double rate)
	{
		return (amount*rate)/100 ;
	}
	public static double getValue()
	{
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		
		return num;
	}
}
