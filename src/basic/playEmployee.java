package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.EmployeeDao;
import basic.dao.EmployeeDaoImpl;
import basic.model.Employee;

public class playEmployee {
	public static void main(String[] args) {
		//Employee myemployee=new Employee(4,"vasanthi",40000,"Engineer");
		//Employee anotheremployee=new Employee(3,"Aruna",5,"SoftwareEngineer");
		
		//EmployeeDao employeedao=new EmployeeDaoImpl();
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		//EmployeeDao employeedao1=(EmployeeDao)context.getBean("employeedao1");
		EmployeeDaoImpl employeedao1=(EmployeeDaoImpl)context.getBean("employeedao1");
		EmployeeDaoHelper helper =context.getBean("employeeDaoHelper",EmployeeDaoHelper.class);
		helper.insertEmployee();
		//employeedao1.Truncate();
		//employeedao1.delRecordById(4);
		//employeedao1.delRecordByNameSalary("bharathi", 90000);
		
		
		
		
		
		//Employee myemployee1=new Employee(13,"prathyusha",5,"Trainee");
		//Employee anotheremployee1=new Employee(14,"bharathi",90000,"Manager");
		//EmployeeDao employeedao1=(EmployeeDao) context.getBean("employeedao1");
		//employeedao1.insert(anotheremployee1);
		
	}

}
