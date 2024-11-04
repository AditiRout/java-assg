package firstProj;

import java.util.Comparator;

public class StudentRollNoSort implements Comparator<StudentDay8>{
	@Override
	public int compare(StudentDay8 o1, StudentDay8 o2) {
		return o1.getRollNo() - o2.getRollNo();
		
	}
	

}
