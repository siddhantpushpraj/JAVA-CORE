package basics;

public class Sum_of_2_digit {
	public static void main(String[] arg)
	{
		System.out.println(getSumOfTwoDigit(55));
	}
	
	public static int getSumOfTwoDigit(int num)
	{
		return num/10 +num%10;
	}
}
