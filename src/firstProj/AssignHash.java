package firstProj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class AssignHash {
		public static void main(String[] args) {
			Set<StudentDay8> students = new HashSet<>();
			
			Set<StudentDay8> treeStudents=new TreeSet<>(new StudentRollNoSort());
			StudentDay8 student1 = new StudentDay8(101, "sachin", 5, 98);
			StudentDay8 student2 = new StudentDay8(105, "virat", 3, 97);
			StudentDay8  student3 = new StudentDay8(103, "rohit", 1, 99);
			StudentDay8 student4 = new StudentDay8 (104, "siraj", 5, 80);
			StudentDay8 student5 = new StudentDay8 (102, "bumrah", 5, 60);
			StudentDay8  student6 = new StudentDay8 (111, "sachin", 5, 98);
			students.add(student1);
			students.add(student2);
			students.add(student3);
			students.add(student4);
			students.add(student5);
			students.add(student6);
			students.add(student2);
			Iterator<StudentDay8> itr = students.iterator();
			while (itr.hasNext()) {
				StudentDay8 student = (StudentDay8) itr.next();
				treeStudents.add(student);
			}
			for(StudentDay8 student: treeStudents) {
				System.out.println(student);
			}
		}
	}



