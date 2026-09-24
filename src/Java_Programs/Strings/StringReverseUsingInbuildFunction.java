package Java_Programs.Strings;
import java.util.*;

public class StringReverseUsingInbuildFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Reverse :");
		String s1=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.reverse().toString();
		System.out.println("Original String - "+s1+ "\nReversed String - "+ sb);
	}
}