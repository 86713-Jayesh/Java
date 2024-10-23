package reverse_a_string;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	str=sb.toString();
	System.out.println(str);
}
}
