package basics;

public class Difference_of_2_digit {
	public static void main(String[] args) {
		
		System.out.println(DigitChecker(55));
	}
	
	public static int DigitChecker(int num)
	{
		return num/10 -num%10;
	}

}
