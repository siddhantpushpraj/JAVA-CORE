import java.util.Arrays;
import java.util.Scanner;

public class stringReverse {
	
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter String ");
		String str=read.nextLine();
		String str1=read.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println("reverse string is");
		System.out.println("append " + sb.append(str1));
		System.out.println("length " + sb.length());
		System.out.println("toString " + sb.toString());
		System.out.println("reverse string is");
		System.out.println(sb.reverse());
		String[] h=str.split(" ");
		System.out.println("split "+ Arrays.toString(h));
	}
}
