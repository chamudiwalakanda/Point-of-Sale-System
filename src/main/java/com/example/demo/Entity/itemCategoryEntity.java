package com.example.demo.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class itemCategoryEntity {
    @Id
    private int categoryCode;
    private String categoryName;
}
