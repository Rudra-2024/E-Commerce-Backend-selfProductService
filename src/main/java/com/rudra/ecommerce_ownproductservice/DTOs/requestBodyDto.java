package com.rudra.ecommerce_ownproductservice.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class requestBodyDto {

    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
