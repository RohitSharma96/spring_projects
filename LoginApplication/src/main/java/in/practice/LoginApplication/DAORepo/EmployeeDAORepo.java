package in.practice.LoginApplication.DAORepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.practice.LoginApplication.Entity.EmployeeEO;

public interface EmployeeDAORepo extends JpaRepository<EmployeeEO, Integer> {

}
