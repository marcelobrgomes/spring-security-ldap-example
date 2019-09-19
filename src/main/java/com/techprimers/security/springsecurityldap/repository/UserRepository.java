package com.techprimers.security.springsecurityldap.repository;

import org.springframework.data.repository.CrudRepository;

import com.techprimers.security.springsecurityldap.entry.User;

public interface UserRepository extends CrudRepository<User, Long> {

}