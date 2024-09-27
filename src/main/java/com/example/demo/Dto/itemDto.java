package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class itemDto {
    private int itemCode;
    private String itemName;
    private Double itemPrice;
}
