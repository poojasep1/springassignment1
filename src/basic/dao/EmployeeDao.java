package basic.dao;

import basic.model.Employee;

public interface EmployeeDao {
	public void insert(Employee employee);
	void delRecordById(int emp_id);
	int delRecordByNameSalary(String EmployeeName,int salary);

}
