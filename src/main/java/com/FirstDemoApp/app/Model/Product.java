package com.FirstDemoApp.app.Model;

import com.FirstDemoApp.app.dto.Item;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId;
    private List<Item> items;



}
