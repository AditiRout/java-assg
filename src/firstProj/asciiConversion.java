package firstProj;

import java.util.Scanner;

public class asciiConversion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		int asci=c;
		System.out.println(asci);

	}

}
