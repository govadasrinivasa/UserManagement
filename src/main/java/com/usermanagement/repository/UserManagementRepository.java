package com.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.usermanagement.entity.Users;

@Repository
public interface UserManagementRepository extends JpaRepository<Users, Long> {

	@Query("select u from user u where u.username like '%username%' and u.password like '%password%'")
    Users findUserByUsername(@Param("username") String username, @Param("password") String password);
}
