package in.practice.LoginApplication.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import in.practice.LoginApplication.DAORepo.EmployeeDAORepo;
import in.practice.LoginApplication.Entity.EmployeeEO;

public class EmployeeAdminService implements IEmployeeAdminService {

	@Autowired
	EmployeeDAORepo employeeDAORepoRef;
	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		if(employeeDAORepoRef.findById(empId).equals(null)) {
			return false;
		}
		else {
			employeeDAORepoRef.deleteById(empId);
			return true;
		}
	}

	@Override
	public List<EmployeeEO> findAllEmployees() {
		// TODO Auto-generated method stub
		return (List<EmployeeEO>) employeeDAORepoRef.findAll();
		/* null; */
	}

	@Override
	public EmployeeEO findEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeDAORepoRef.findById(empId).orElse(null);
	}

}
