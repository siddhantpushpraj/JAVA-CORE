package loops;

import java.util.Scanner;

public class LoopDemo {
		public static void main(String[] args)
		{
			int num=getNumber();
			for(int i=1;i<=10;i++)
			{
				Multiple(num, i);
			}
			
		}
		public static void Multiple(int num,int i)
		{
			System.out.println(num +" * "+ i + " = " + num*i  );
		}
		
		public static int getNumber()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr any number");
			int num=sc.nextInt();
			return num;
		}
}
