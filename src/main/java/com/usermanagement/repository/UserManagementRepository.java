package com.usermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usermanagement.entity.User;

@Repository
public interface UserManagementRepository extends JpaRepository<User, Long> {

	boolean existsByMobile(String mobile);
    
//    Optional<User> findByUsername(String username);
}
