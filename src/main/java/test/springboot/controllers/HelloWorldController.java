package test.springboot.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  
//Controller  
@Controller  
public class HelloWorldController {
	@RequestMapping("home")  
	public String helloWorld()  
	{
		System.out.println("hello");
	return "Hello ";  
	}  
}
