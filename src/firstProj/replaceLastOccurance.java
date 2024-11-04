package firstProj;

import java.util.Scanner;

public class replaceLastOccurance {
	public static void main(String[] args) {
		    Scanner scanner= new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String sample =scanner.next();
	        System.out.println("Enter the letter to be replaced:");
	        char f =scanner.next().charAt(0);
	        System.out.println("Enter the new letter ");
	        char r =scanner.next().charAt(0);
	        System.out.println(myReplaceLast(sample,f,r));
	        scanner.close();
	}
	public static String myReplaceLast(String word,char old,char replace) {
		    int count=0;
	        char[] arr=word.toCharArray();
	        String str;
	        for(int i=arr.length-1;i>=0;i--)
	        {   
	        	if(arr[i]==old)
	        	{ 
	        	    arr[i]=replace;
	                break;
	            }
	            count++;
	        }
	        if(count >arr.length-1)
	            return str= "Letter to be replaced not present" ;
	        else
	            return str= new String(arr);
	    }
	
	}


