package in.practice.SpringBootAndSecurity.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.practice.SpringBootAndSecurity.Entity.UserLoginEO;

public interface LoginDAO extends CrudRepository<UserLoginEO, Integer> {

	@Query("from UserLoginEO where Username=?1 and Password=?2")
	public int findByUsername(UserLoginEO userLoginEO);
}
