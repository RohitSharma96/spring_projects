package in.practice.BookHibernate.Entity.Relation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="customerdetails")
public class CustomerDetails {
	@Id
	@GenericGenerator(name = "gen",strategy = "foreign",parameters = @Parameter(name = "property",value = "newCustomerRef"))
	@GeneratedValue(generator = "gen")
	private String email;
	private String name;
	private String phone;
	@OneToOne
	@PrimaryKeyJoinColumn
	private NewCustomer newCustomerRef;
	public CustomerDetails(String email, String name, String phone) {
		super();
		//this.email = email;
		this.name = name;
		this.phone = phone;
	}
	public CustomerDetails() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
