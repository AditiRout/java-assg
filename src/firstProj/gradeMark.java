package firstProj;

import java.util.Scanner;

public class gradeMark {
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	  System.out.println("Enter the marks");
	  int x=s.nextInt();
	  if(x>=80 && x<=100) {
		  System.out.println("A");
	  }else if(x>=70 && x<=79) {
		  System.out.println("B");
	  }else if (x>=60 && x<=69) {
		  System.out.println("C");
	  }else if(x>=50 && x<=59) {
		  System.out.println("D");
	  }else if(x>=0 && x<=49){
		  System.out.println("Fail");
	  }else {
		  System.out.println("Invalid Marks");
	  }
	}

}
