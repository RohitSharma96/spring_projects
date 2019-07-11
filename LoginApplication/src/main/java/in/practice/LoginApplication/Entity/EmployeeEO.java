package in.practice.LoginApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")
@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@ToString
public class EmployeeEO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	@Column
	private String employeeUsername;
	@Column
	private String employeePassword;
	@Column
	private String employeeName;
	@Column
	private int employeePhone;
	@Column
	private String employeeAddress;
}
