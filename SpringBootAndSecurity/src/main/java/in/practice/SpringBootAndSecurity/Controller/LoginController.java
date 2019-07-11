package in.practice.SpringBootAndSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.practice.SpringBootAndSecurity.DAO.LoginDAO;

@Controller
public class LoginController {

	@Autowired
	LoginDAO loginRef;
	
	@RequestMapping("/")
	public String login() {
		return "login.jsp";
	}
}
