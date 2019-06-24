package com.study.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.study.book.domain.securiry.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

}
