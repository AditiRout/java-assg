package firstProj;

public class StudentDay8{
	private int rollNo;
	private String name;
	private int sem;
	private int marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public StudentDay8() {
		// TODO Auto-generated constructor stub
	}
	public StudentDay8(int rollNo, String name, int sem, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.sem = sem;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", sem=" + sem + ", marks=" + marks + "]";
	}
	
	
}
