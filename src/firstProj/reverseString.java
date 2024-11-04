package firstProj;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String line=s.nextLine();
		System.out.println("Reverese String: "+myReverseString(line));
		
	}
	public static String myReverseString(String line) {
		StringBuilder result= new StringBuilder();
        for (int i = line.length()-1; i >= 0; i--) {
            result.append(line.charAt(i));
        }
        return result.toString();
	}

}
