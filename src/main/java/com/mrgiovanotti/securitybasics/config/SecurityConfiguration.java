package com.mrgiovanotti.securitybasics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final String ADMIN_ROLE = "ADMIN";
	private static final String USER_ROLE = "USER";

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("ggranda")
				.password("$2a$10$DzXXpW6FJqiP2zjLgshb6OtqtRGVc5FOYaasP6c7oq9EJ/Yqk6YKe").roles(ADMIN_ROLE).and()
				.withUser("user").password("$2a$10$oRWPnV0ugIQMzAFksOESOureo/mwCtYnB93.fRc.joF7Wu0w7l5w.")
				.roles(USER_ROLE);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/api/v*/public/**").permitAll()
				.antMatchers("/api/v*/secured/user/**").hasRole(USER_ROLE).antMatchers("/api/v*/secured/admin")
				.hasRole(ADMIN_ROLE).antMatchers("/api/v*/secured/admin-user").hasAnyRole(ADMIN_ROLE, USER_ROLE)
				.anyRequest().authenticated().and().formLogin();
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
