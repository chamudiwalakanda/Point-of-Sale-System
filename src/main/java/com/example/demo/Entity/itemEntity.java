package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class itemEntity {
    @Id
    private int itemCode;
    private String itemName;


    @ManyToOne
    private itemCategoryEntity itemcategory;

    //getters and setters
}