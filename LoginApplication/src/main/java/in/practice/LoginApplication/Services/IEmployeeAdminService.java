package in.practice.LoginApplication.Services;

import java.util.List;

import in.practice.LoginApplication.Entity.EmployeeEO;

public interface IEmployeeAdminService {
	
	public boolean deleteEmployee(int empId);
	public List<EmployeeEO> findAllEmployees();
	public EmployeeEO findEmployee(int empId);
}
