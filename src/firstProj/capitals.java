package firstProj;

import java.util.Scanner;

public class capitals {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter");
		String word=scan.next();
		int answer=findCaps(word,0);
		System.out.println("No of Capitals are: "+ answer);
		scan.close();
	}
	public static int findCaps(String word,int result) {
		for(int i=0;i<word.length();i++) {
			if(Character.isUpperCase(word.charAt(i))){
				result++;
			}
		}
		return result;
	}

}