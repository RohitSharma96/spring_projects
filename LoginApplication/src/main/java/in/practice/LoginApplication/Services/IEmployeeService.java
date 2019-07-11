package in.practice.LoginApplication.Services;



import in.practice.LoginApplication.Entity.EmployeeEO;

public interface IEmployeeService {

	public boolean registerEmployee(EmployeeEO employeeEORef);
	public boolean updateEmployee(EmployeeEO employeeEORef);
	
}
