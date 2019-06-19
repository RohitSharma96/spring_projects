package in.practice.SpringBootLogging.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		LOGGER.info("This is the info Message");
		LOGGER.error("This is the error message");
		LOGGER.trace("This is the Trace Message");
		
		return "showing The logs";
	}
}
