package basics;

import java.util.Scanner;

public class calculateAverage {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int[] myIntArray = getInteger(5);
		System.out.println("average = " + calAverage(myIntArray));
		
	}
	public static int[] getInteger(int number)
	{
		System.out.println("Enter " + number +" integer value");
		int[] value= new int[number];
		for(int i=0;i<value.length;i++)
		{
			value[i]=sc.nextInt();
		}
		return value;
	}
	public static double calAverage(int[] array)
	{
		double sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		return sum/(double)array.length;
	}
}
