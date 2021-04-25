package basic.model;

public class Employee {
	int emp_id;
	String emp_name;
	int salary;
	String destination;
	  public Employee (int emp_id, String emp_name,int salary,String destination)
	  {
		  super();
		  this.emp_id=emp_id;
		  this.emp_name=emp_name;
		  this.salary=salary;
		  this.destination=destination;
	  }
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	  
	  
}
