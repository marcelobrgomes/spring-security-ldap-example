package com.techprimers.security.springsecurityldap.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;

@EnableGlobalMethodSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Value("${spring.ldap.urls}")
	private String ldapUrl;
	
	@Value("${ldap.domain}")
	private String ldapDomain;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin();
    }
    
    @Bean
	public ActiveDirectoryLdapAuthenticationProvider activeDirectoryLdapAuthenticationProvider(){
		return new ActiveDirectoryLdapAuthenticationProvider(ldapDomain, ldapUrl);
	}
}