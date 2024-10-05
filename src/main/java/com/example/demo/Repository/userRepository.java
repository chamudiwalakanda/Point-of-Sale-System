package com.example.demo.Repository;

import com.example.demo.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<userEntity, Integer> {
    static Optional<userEntity> findByUsername(String username);
}
