package firstProj;

import java.util.Scanner;

public class CountingZeros {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number :");
		int number=scan.nextInt();
		int answer=countZeros(number,0);
		System.out.println("No of Zeros : "+ answer);
	}
	public static int countZeros(int number,int result) {
		//if(number==0) {return 0;}
		while(number>0) {
			int x=number%10;
			number/=10;
			if(x==0) {
				result++;
			}else {
				continue;
			}
		}
		return result;
	}

}
