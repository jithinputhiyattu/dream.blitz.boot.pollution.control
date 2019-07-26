package dream.blitz.boot.pollution.control.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@RequestMapping("/")
	public String test() {
		return "Hello World";
	}

}
