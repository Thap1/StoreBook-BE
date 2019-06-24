package com.study.book.domain.securiry;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority, Serializable {
	private static final long serialVersionUID = 123123L;
	private String authority;

	public Authority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}

}
