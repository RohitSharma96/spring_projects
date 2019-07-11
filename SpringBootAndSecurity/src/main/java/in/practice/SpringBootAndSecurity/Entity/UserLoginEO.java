package in.practice.SpringBootAndSecurity.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Setter;

@Entity
@Table(name="USER_TABLE")
@Data
@Setter
public class UserLoginEO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String UserID;
	@Column(name = "UserName")
	private String Username;
	@Column (name = "Password")
	private String Password;
}
