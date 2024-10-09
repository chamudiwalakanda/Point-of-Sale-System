package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.itemEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepository extends JpaRepository<itemEntity,Integer>{

}
