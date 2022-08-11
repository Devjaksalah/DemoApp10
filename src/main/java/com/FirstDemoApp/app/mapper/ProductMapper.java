package com.FirstDemoApp.app.mapper;


import com.FirstDemoApp.app.Model.Product;
import com.FirstDemoApp.app.dto.ProductDto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ProductMapper {


     ProductDto modelTODto(Product product);
     List<ProductDto> modelsTODtos(List<Product> products);

     @InheritConfiguration
     Product dtoToModel(ProductDto productDto);











}
