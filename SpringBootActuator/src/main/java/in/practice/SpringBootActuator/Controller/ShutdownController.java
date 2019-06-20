package in.practice.SpringBootActuator.Controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ShutdownController {

	@ResponseBody
	@RequestMapping(path = "/shutdown")
	public String callingActuatorShutdown() {
		
		String url = "http://localhost:8090/actuator/shutdown" ;
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        RestTemplate restTempelate = new RestTemplate();
        
        HttpEntity<String> requestBody = new HttpEntity<String>("",headers);
        
        String e = restTempelate.postForObject(url, requestBody, String.class);
        
        return "Result"+e;
	}
}
