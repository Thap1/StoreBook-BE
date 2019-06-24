package com.study.book.service;

import java.util.Set;

import com.study.book.domain.User;
import com.study.book.domain.securiry.UserRole;

public interface UserService {
	User createUser(User user, Set<UserRole> userRoles);

}
