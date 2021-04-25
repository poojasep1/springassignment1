package basic.dao;

import java.util.List;

import basic.model.Employee;

public interface EmployeeDao {
	public void insert(Employee employee);
	void delRecordById(int emp_id);
	int delRecordByNameSalary(String EmployeeName,int salary);
	void insert(List<Employee> employees);

}
