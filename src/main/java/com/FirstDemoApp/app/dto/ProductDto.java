package com.FirstDemoApp.app.dto;

import lombok.Data;

import javax.persistence.Id;
import java.util.List;


@Data
public class ProductDto {
    @Id
    private Long id;
    private String name;
    private String description;
    private String quantity;
    private int price;
    private List<Item> itemsList;


}
