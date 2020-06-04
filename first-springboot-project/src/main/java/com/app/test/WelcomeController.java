package com.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.SeprateService;


@RestController
public class WelcomeController {
	
	private WelcomeService service = new WelcomeService();
	@Autowired  //Auto wiring
	private NewService newService;
	
	@Autowired  //Auto wiring
	private SeprateService sepService;
	
    @RequestMapping("/welcome")
	public String welcome(){
    	//return newService.retrieveWelcomeService();
    	return sepService.retrieveWelcomeService();
		
		//return "This is welcome page";
    }
}
class WelcomeService{
	public String retrieveWelcomeService() {
		return "Good Morning !!";
	}
}
@Component
class NewService{
	public String retrieveWelcomeService() {
		return "Good Morning !!";
	}
}


