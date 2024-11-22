package com.VIP.VIP;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VIP.VIP.model.Add;
import com.VIP.VIP.repository.UserRepository;

@RestController
public class PostController {
	
	@Autowired
    private UserRepository userRepository;
	
	@PostMapping("/adduser")
	public String adduser(@ModelAttribute Add user) throws Exception{
		userRepository.save(user);
		System.out.println(user.toString());
		return Files.readString(Paths.get("src/main/resources/static/success.html"));
	}
}
