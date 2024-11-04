package firstProj;
import java.util.Scanner;

public class replaceFirstOccurance{

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string:");
        String sample =scanner.next();
        System.out.println("Enter the letter to be replaced:");
        char f =scanner.next().charAt(0);
        System.out.println("Enter the new letter ");
        char re =scanner.next().charAt(0);
        System.out.println(myReplaceFirst(sample,f,re));
        scanner.close();
    }
    public static String myReplaceFirst(String word, char find , char replace)
    {   int count=0;
        char[] arr=word.toCharArray();
        String str;
        for(int i=0;i<arr.length;i++)
        {   if(arr[i]==find)
           { arr[i]=replace;
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
