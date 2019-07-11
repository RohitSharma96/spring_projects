package in.practice.LoginApplication.DAORepo;

import org.springframework.data.jpa.repository.JpaRepository;


import in.practice.LoginApplication.Entity.EmployeeAdminEO;

public interface EmployeeAdminDAORepo extends JpaRepository<EmployeeAdminEO, Integer>{

}
