package com.example.demoUser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoUser.Entity.User;

@Repository

public interface UserRepository extends JpaRepository<User,Long>{

}
