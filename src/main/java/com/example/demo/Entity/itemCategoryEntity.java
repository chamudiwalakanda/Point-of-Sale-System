package com.example.demo.Entity;

import jakarta.persistence.*;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class itemCategoryEntity {
    @Id
    private int categoryCode;
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<itemEntity> items;

    //getters and setters
}
