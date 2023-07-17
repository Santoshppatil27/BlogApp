package com.blog.com.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("**")
public class UserController 
{
	@GetMapping("/welcome")
	public String Hello()
	{
		return "It's Work Finally";
	}
	
}
