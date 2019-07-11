package in.practice.SpringDataJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import in.practice.SpringDataJPA.Entity.EmployeeEO;
import in.practice.SpringDataJPA.Repository.EmployeeRepository;

@Controller
public class MainController {

	@Autowired
	EmployeeRepository employeeRepositoryRef;
	
	private static final String[] NAMES = {"ROHIT","AMIT","CHANDAN"};
	
	@ResponseBody
	@RequestMapping("/")
	public String homePage() {
		return "HomePage";
	}
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/testInsert")
	 */
	/*
	 * public String TestInsert() { Long empMaxID =
	 * this.employeeRepositoryRef.getMaxId(); long id = empMaxID+1; EmployeeEO
	 * employeeEORef = new EmployeeEO(); int random = new Random().nextInt(3);
	 * String name = NAMES[random]; employeeEORef.setId(id);
	 * employeeEORef.setEmployeeName(name); employeeEORef.setEmployeeNo("E"+id);
	 * return "User Created,"+"<h3>name</h3>"; }
	 */
	
	@ResponseBody
	@RequestMapping("/showAll")
	public String showAllEmployees(Model model) {
		Iterable<EmployeeEO> employees = this.employeeRepositoryRef.findAll();
		model.addAttribute("employees",employees );
		
		return "showAll";
		/*
		 * String html = ""; for (EmployeeEO employeeEO : employees) { html =
		 * html+employeeEO+"<br>"; } return html;
		 */
	}
}
