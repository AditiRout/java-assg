package firstProj;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=scan.nextInt();
		int answer=reverse(x,0);
		System.out.println("Reversed Number : "+ answer);
		
		
	}
	public static int reverse(int number,int result) {
		int remainder;
		while(number>0) {
			remainder=number%10;
			result=result*10+remainder;
			number/=10;
		}
		return result;
	}

}
