package in.practice.SpringDataJPA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeEO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "ENO")
	private String employeeNo;
	@Column(name = "ENAME")
	private String employeeName;
}
