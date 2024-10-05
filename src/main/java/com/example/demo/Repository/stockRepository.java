package com.example.demo.Repository;


import com.example.demo.Entity.stockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface stockRepository extends JpaRepository<stockEntity, Integer> {
}
