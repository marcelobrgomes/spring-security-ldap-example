package com.techprimers.security.springsecurityldap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.techprimers.security.springsecurityldap.config.ApplicationConfiguration;
import com.techprimers.security.springsecurityldap.entry.User;
import com.techprimers.security.springsecurityldap.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSecurityLdapApplicationTests {

	@Autowired
	UserRepository repository;
	
	@Test
	public void readAllUsers() {
		List<User> users = (List<User>) repository.findAll();
		assertThat(users.isEmpty(), is(false));
	}

}
