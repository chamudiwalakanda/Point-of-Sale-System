package com.example.demo.Repository;

import com.example.demo.Entity.itemCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface itemCategoryRepository extends JpaRepository<itemCategoryEntity,Integer> {
}
