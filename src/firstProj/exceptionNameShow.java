
package firstProj;

public class exceptionNameShow {
	public static void main(String[] args) {
		nameValidator name=new nameValidator();
		try {
			String sample="1Rohit";
			name.nameCheck(sample);
			System.out.println(sample);
			
		}catch(InvalidNameException  e) {
			e.printStackTrace();
		}
	}
	
//		System.out.println("Name doesnt have any numbers");
		

		}





