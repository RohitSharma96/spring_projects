package in.practice.SpringDataJPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.practice.SpringDataJPA.Entity.EmployeeEO;

public interface EmployeeRepository extends CrudRepository<EmployeeEO, Long>{

	EmployeeEO findEmployeeByemployeeNo(String employeeNo);
	List<EmployeeEO> findEmployeeWithName(String employeeName);
	@Query("SELECT MAX(employeeId) from EmployeeEO emp")
	Long getMaxId();
	}
