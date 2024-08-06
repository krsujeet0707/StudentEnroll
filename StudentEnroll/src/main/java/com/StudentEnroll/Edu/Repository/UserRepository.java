package com.StudentEnroll.Edu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentEnroll.Edu.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

