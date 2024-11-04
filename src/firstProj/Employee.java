package firstProj;

public class Employee {
//	dept name (sales , IT , admin)
//    -> emp id
//    -> designation  
//    -> location  (bangalore , hyd)
//    -> manager name (john , rock , brock)

	private String dept;
	private int empId;
	private String designation;
	private String location;
	private String name;
	
	public Employee(String deptName, int empId, String designation, String location, String managerName) {
        this.dept = deptName;
        this.empId = empId;
        this.designation = designation;
        this.location = location;
        this.name = managerName;
    }
	 public String getDept() {
	        return dept;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public String getName() {
	        return name;
	    }
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "dept='" + dept + '\'' +
	                ", empId=" + empId +
	                ", designation='" + designation + '\'' +
	                ", location='" + location + '\'' +
	                ", managerName='" + name + '\'' +
	                '}';
	    }
}
