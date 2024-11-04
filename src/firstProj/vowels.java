package firstProj;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String string=scan.next();
		int answer=findVowel(string,0);
		System.out.println("No of Vowels is :"+ answer);
		
		
	}
	public static int findVowel(String string,int result) {
		string=string.toLowerCase();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u') {
				result++;
			}
		}
		return result;
	}

}
