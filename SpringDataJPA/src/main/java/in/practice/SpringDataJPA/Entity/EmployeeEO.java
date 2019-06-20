package in.practice.SpringDataJPA.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeEO {

	private Long id;
	private String employeeNo;
	private String employeeName;
}
