package com.example.restcontrolleradviceannotation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id ;
    private String name ;
    private Double price ;
    private Integer qty ;
}
