
public class Stringbasic {

	public static void main(String[] args) {
		String str=new String("siddhant");
		String str1=new String("siddhant");
		String str2=new String("siddhant");
		//immutable
		//str.concat("pushpraj");
		str=str.concat(" pushpraj");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		//mutable
		StringBuffer sb=new StringBuffer("Siddhant");
		sb.append(" Pushpraj");
		StringBuffer sb1=new StringBuffer("Siddhant");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb);
	}
}
