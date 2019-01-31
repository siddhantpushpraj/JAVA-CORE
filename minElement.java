package basics;

import java.util.Scanner;

public class minElement {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		double[] myArray= new double[5];
		System.out.println("enetr values ");
		myArray=readInteger(5);
		System.out.println("min element is = " + getMin(myArray));
	}
	public static double[] readInteger(int count)
	{
		double[] values= new double[count];
		for(int i=0;i<values.length;i++)
		{
			values[i]=sc.nextDouble();
		}
		return values;
	}
	public static double getMin(double[] array)
	{
		double min=array[0];
		for(int i=01;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		return min;
	}
}
