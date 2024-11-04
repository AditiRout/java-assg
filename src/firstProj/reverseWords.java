package firstProj;

import java.util.Scanner;

public class reverseWords {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String line=s.nextLine();
		String[]words=line.split(" ");
		System.out.println("Reversed Words: "+myReverseWords(words));
		
	}
	public static String myReverseWords(String[]arr) {
		StringBuilder result=new StringBuilder();
		for(String word:arr) {
			StringBuilder sb=new StringBuilder();
			for(int i=word.length()-1;i>=0;i--) {
				sb.append(word.charAt(i));
				
			}
			result.append(sb);
			result.append(" ");
			sb.setLength(0);
			
		}
		return result.toString();
	}
	
	

}
