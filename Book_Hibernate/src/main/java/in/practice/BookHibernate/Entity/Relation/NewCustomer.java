package in.practice.BookHibernate.Entity.Relation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "newcustomer")
public class NewCustomer {
	
	@Id
	private String email;
	private String password;
	@OneToOne(mappedBy = "newCustomerRef",cascade = CascadeType.ALL)
	private CustomerDetails customerDetailsRef;
	public NewCustomer() {
		super();
	}
	public NewCustomer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
