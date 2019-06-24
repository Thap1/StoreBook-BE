package com.study.book;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.book.config.SecurityUtility;
import com.study.book.domain.User;
import com.study.book.domain.securiry.Role;
import com.study.book.domain.securiry.UserRole;
import com.study.book.service.UserService;

@SpringBootApplication
public class StoreBookBeApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(StoreBookBeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user4 = new User();
		user4.setFirstName("T");
		user4.setLastName("T");
		user4.setUsername("T");
		user4.setPassword(SecurityUtility.passwordEncoder().encode("124456"));
		user4.setEmail("hxthap111@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role4 = new Role();
		role4.setRoleId(4);
		role4.setName("T");
		userRoles.add(new UserRole(user4, role4));
		userService.createUser(user4, userRoles);
		userRoles.clear();
	}

}
