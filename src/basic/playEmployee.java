package basic;

import basic.dao.EmployeeDao;
import basic.dao.EmployeeDaoImpl;
import basic.model.Employee;

public class playEmployee {
	public static void main(String[] args) {
		Employee myemployee=new Employee(4,"vasanthi",40000,"Engineer");
		Employee anotheremployee=new Employee(3,"Aruna",70000,"SoftwareEngineer");
		
		EmployeeDao employeedao=new EmployeeDaoImpl();

		
		employeedao.insert(myemployee);
		
	}

}
