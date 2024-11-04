package firstProj;

import java.util.Scanner;

public class assignment1Day4 {
	
	    public static void main(String[] args) {
	        
	    	Scanner scanner= new Scanner(System.in);
			System.out.println("sum,max,min, sub, mul?");
			String operationString=scanner.next().trim().toLowerCase();
			System.out.println("How many numbers? ");
			int size=scanner.nextInt();
			int[] numArr=new int[size];
			System.out.println("Enter numbers:");
			for(int i=0;i<size;i++) {
				numArr[i]=scanner.nextInt();
			}
			
			
			System.out.println("The " + operationString + " is "+performOperation(operationString,numArr));
			
			
			scanner.close();
			
		}
	    

	    public static int performOperation(String operation, int... numbers) {
	        switch (operation.toLowerCase()) {
	            case "sum":
	                return add(numbers);
	            case "sub":
	                return sub(numbers);
	            case "mul":
	                return mul(numbers);
	            case "avg":
	                return avg(numbers);
	            case "max":
	                return max(numbers);
	            case "min":
	                return min(numbers);
	            default:
	                throw new IllegalArgumentException("Invalid operation: " + operation);
	        }
	    }

	    private static int add(int... numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum;
	    }

	    private static int sub(int... numbers) {
	        if (numbers.length == 0) return 0;
	        int result = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            result -= numbers[i];
	        }
	        return result;
	    }

	    private static int mul(int... numbers) {
	        if (numbers.length == 0) return 0;
	        int result = 1;
	        for (int number : numbers) {
	            result *= number;
	        }
	        return result;
	    }
	    private static int avg(int... numbers) {
	        if (numbers.length == 0) return 0;
	        int sum = add(numbers); // Reusing the add method
	        return  sum / numbers.length;
	    }
	    private static int max(int... numbers) {
	        if (numbers.length == 0) throw new IllegalArgumentException("No numbers provided");
	        int max = numbers[0];
	        for (int number : numbers) {
	            if (number > max) {
	                max = number;
	            }
	        }
	        return max;
	    }

	    private static int min(int... numbers) {
	        if (numbers.length == 0) throw new IllegalArgumentException("No numbers provided");
	        int min = numbers[0];
	        for (int number : numbers) {
	            if (number < min) {
	                min = number;
	            }
	        }
	        return min;
	    }
	}
	


