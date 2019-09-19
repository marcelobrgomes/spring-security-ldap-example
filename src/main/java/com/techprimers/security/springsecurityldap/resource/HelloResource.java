package com.techprimers.security.springsecurityldap.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.security.springsecurityldap.repository.UserRepository;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

	@Autowired
	UserRepository repository;
	
    @GetMapping("/check")
    public String check() {
    	//List<User> users = (List<User>) repository.findAll();
    	
        //return users.toString();
    	return "OK";
    }
}
