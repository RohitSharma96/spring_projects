package in.practice.LoginApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee_admin")
@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeAdminEO {
	
	@Id
	private int adminID;
	@Column
	private String adminUsername;
	@Column
	private String adminPassword;
	@Column
	private String adminName;
	@Column
	private int adminPhone;
	@Column
	private String adminAddress;
}
