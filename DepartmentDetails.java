package sample;

import java.util.List;

public class DepartmentDetails {


	int id;
	String department_name;
	List<PersonDetails> details;
	
	
	public DepartmentDetails(int id, String department_name, List<PersonDetails> details) {
		super();
		this.id = id;
		this.department_name = department_name;
		this.details = details;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public List<PersonDetails> getDetails() {
		return details;
	}
	public void setDetails(List<PersonDetails> details) {
		this.details = details;
	}
	

	@Override
	public String toString() {
		return "DepartmentDetails [id=" + id + ", department_name=" + department_name + ", details=" + details + "]";
	}
}
