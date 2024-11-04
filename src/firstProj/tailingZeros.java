package firstProj;

import java.util.Scanner;

public class tailingZeros {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=scanner.nextInt();
		int answer=countTrailZeros(x,0);
		System.out.println("No of Trailing Zeros:"+ " "+answer);
		
	}
	public static int countTrailZeros(int number,int result) {
		if(number==0) {return 0;}
		while(number%10==0) {
			result++;
			number/=10;
		}
		return result;
	}

}
