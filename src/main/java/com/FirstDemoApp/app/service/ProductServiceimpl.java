package com.FirstDemoApp.app.service;


import com.FirstDemoApp.app.Model.Product;
import com.FirstDemoApp.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductServiceimpl implements ProductService {

    private final ProductRepository productRepository;



    public ProductServiceimpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product save(Product prd) {
        return null;
    }

    @Override
    public List<ProductRepository> findAll() {
        return productRepository.findAll();
    }
/*
    public List<ProductRepository> findAll() {
        return productRespository.();
    }

    public Optional<ProductRepository> findById(Long id) {
        return productRespository.findById(id);
    }

    public void deleteById(Long id) {
        productRespository.deleteById(id);
    }

 */


}
