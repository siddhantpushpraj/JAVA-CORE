import java.util.Scanner;

public class VowelCount {

	public static void main(String[] main) {
		String s=new String("SIDDhant hellO");
		int count=0;
		s=s.toUpperCase();
		System.out.println(s);
		for(int i = 0;i < s.length();i++){
			if(s.charAt(i)=='O' || s.charAt(i)=='A' || s.charAt(i)=='U' || s.charAt(i)=='E' || s.charAt(i)=='I') {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
	