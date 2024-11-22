package com.VIP.VIP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	

	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/login")
	public String login() {
		return "loginwebpage.html";
	}
	
	@GetMapping("/register")
	public String register() {
		return "registerwebpage.html";
	}
	


}
