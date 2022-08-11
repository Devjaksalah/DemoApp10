package com.FirstDemoApp.app.service;

import com.FirstDemoApp.app.Model.Product;
import com.FirstDemoApp.app.repository.ProductRepository;

import java.util.List;

public interface ProductService {


    Product save(Product prd);
//    Product update(Product prd);
//    void delete(long idPrd);
//    Product findOne(long idPrd);
    List<ProductRepository> findAll();



}
