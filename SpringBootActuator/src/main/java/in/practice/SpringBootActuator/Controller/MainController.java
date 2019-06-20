package in.practice.SpringBootActuator.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping("/")
	public String home(HttpServletRequest req) {
		String contextPath = req.getContextPath();
		String host = req.getServerName();
		
		String endPointBasePath = "/actuator";
		
		StringBuilder sb = new StringBuilder();
		sb.append(("<h2>Sprig Boot Actuator</h2>"));
        sb.append("<ul>");
 
        // http://localhost:8090/actuator
        String url = "http://" + host + ":8090" + contextPath + endPointBasePath;
 
        sb.append("<li><a href='" + url + "'>" + url + "</a></li>");
 
        sb.append("</ul>");
         
        return sb.toString();
		}
}
