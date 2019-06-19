package in.practice.SpringBootWithThymeleaf.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor

public class Person {

	private String firstName;
	private String lastName;
	
}
