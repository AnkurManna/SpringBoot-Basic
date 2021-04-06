package test.springboot.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import test.springboot.models.*;
import test.springboot.service.*;
//Controller  
@RestController  
public class homcon {
	
	static class temp{
		String  name,password;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
	}
	
	@Autowired  
	ItemsService itemService; 
	@GetMapping("/" )  
	public String helloWorld()  
	{
		ObjectMapper x = new ObjectMapper();
		String jsonStr = null;
		try {
			jsonStr = x.writeValueAsString(itemService.getAllItems());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  jsonStr;
	}
	
	@PostMapping("/item")  
	private int saveBook(@RequestBody ItemModel item)   
	{  
	itemService.saveOrUpdate(item);  
	return 1;  
	}  
}
