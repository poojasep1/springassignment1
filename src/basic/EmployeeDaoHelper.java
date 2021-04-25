package basic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.dao.EmployeeDao;
import basic.model.Employee;
@Service("employeeDaoHelper")
public class EmployeeDaoHelper {
	@Autowired
	EmployeeDao employeeDaoImpl;
	void insertEmployee() {
		Employee e1=new Employee(1,"pooja",60000,"software Engineer");
		Employee e2=new Employee(2,"chandu",90000,"manager");
		Employee e3=new Employee(3,"vasanthi",80000,"team leader");
		Employee e4=new Employee(4,"Aruna",70000,"Director");
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employeeDaoImpl.insert(employees);
		System.out.println("batch employees are inserted successfully");
	}

}
