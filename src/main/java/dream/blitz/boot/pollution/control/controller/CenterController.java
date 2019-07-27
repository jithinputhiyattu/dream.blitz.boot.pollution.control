package dream.blitz.boot.pollution.control.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dream.blitz.boot.pollution.control.jpa.Center;
import dream.blitz.boot.pollution.control.service.CenterService;

@RestController
public class CenterController {

	@Autowired
	CenterService centerService;
 
	@RequestMapping("/center")
	public List<Center> getCenters() {
		
		return centerService.findAll();
		
	}

}
