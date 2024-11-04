package firstProj;

import java.util.Scanner;

public class equalCharacters {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first character");
		char first=scanner.next().charAt(0);
		System.out.println("Enter second character");
		char second=scanner.next().charAt(0);
		System.out.println("Both Characters are equal?: "+ myEqual(first,second));
		
  
	}
	public static boolean myEqual(char first,char second) {
		return Character.toLowerCase(first)==Character.toLowerCase(second);
	}

}
