package com.techprimers.security.springsecurityldap.entry;

import javax.naming.Name;

import org.springframework.data.annotation.Id;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;

@Entry(objectClasses = { "person" })
public class User {

	@Id
	private Name id;
	
	@Attribute(name="cn")
	private String username;
	
	@Attribute(name="sn")
	private String password;
}