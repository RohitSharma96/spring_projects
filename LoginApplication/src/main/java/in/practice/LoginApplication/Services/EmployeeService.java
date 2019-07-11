package in.practice.LoginApplication.Services;

import org.springframework.beans.factory.annotation.Autowired;

import in.practice.LoginApplication.DAORepo.EmployeeDAORepo;
import in.practice.LoginApplication.Entity.EmployeeEO;

public class EmployeeService implements IEmployeeService{
	
	@Autowired
	EmployeeDAORepo employeeDAORepoRef;
	@Override
	public boolean registerEmployee(EmployeeEO employeeEORef) {
		// TODO Auto-generated method stub
		employeeDAORepoRef.save(employeeEORef);
		return true;
	}

	@Override
	public boolean updateEmployee(EmployeeEO employeeEORef) {
		// TODO Auto-generated method stub
		if(employeeDAORepoRef.findById(employeeEORef.getEmployeeId()).equals(null))
		return false;
		else {
			employeeDAORepoRef.save(employeeEORef);
			return true;
		}
	}

}
