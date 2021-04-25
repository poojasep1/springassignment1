package basic.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import basic.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
//private JdbcTemplate jdbcTemplate=new JdbcTemplate( getDataSource());
private JdbcTemplate jdbcTemplate;

	

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
	@Override
	public void insert(Employee employee) {
		String sql="INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
		Object[] objects= {employee.getEmp_id(),employee.getEmp_name(),employee.getSalary(),employee.getDestination()};
		int no_rows_inserted=jdbcTemplate.update(sql,objects);
		
	}
	public Object getDataSource() {
		String url="jdbc:mysql://127.0.0.1:3306/spring_jdbc1";
		String username="root";
		String password="";
		DriverManagerDataSource dataSource=new DriverManagerDataSource(url,username,password);
		return dataSource;
		
	}
	@Override
	public void delRecordById(int emp_id) {
		String delSql="DELETE FROM EMPLOYEE WHERE emp_id=?";
		int noRecordsDeleted=jdbcTemplate.update(delSql,emp_id);
		System.out.println("no of records deleted:="+noRecordsDeleted);
		
	}

}
