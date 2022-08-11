package com.FirstDemoApp.app.Controller;


import com.FirstDemoApp.app.Model.Product;
import com.FirstDemoApp.app.dto.ProductDto;
import com.FirstDemoApp.app.mapper.ProductMapper;
import com.FirstDemoApp.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    ProductService productService;

/*

 */
//    @GetMapping("/products")
//    public ResponseEntity<List<ProductDto>> findAll(){
//        return new ResponseEntity<>(productMapper.modelTODto((Product) productService.findAll()),HttpStatus.OK);
//
//    }
//    @GetMapping("/products")
//    public ResponseEntity<List<ProductDto>> findAll(){
//        return new ResponseEntity<>(productMapper.modelsTODtos(productService.findAll()),HttpStatus.OK);
//
//    }




/*
    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> findAll(){
        return new ResponseEntity<>(productMapper.modelToDto(productService.findAll()),HttpStatus.OK);

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<List<ProductDto>> findById(@PathVariable( value="id") Integer id){
        return new ResponseEntity<>(productMapper.modelToDto(productService.findAll()),HttpStatus.OK);

    }
    @DeleteMapping("/products/{id}")
    public ResponseEntity<List<ProductDto>>deleteById(@PathVariable( value="id") Integer id){
        ProductDto productDto = productMapper.modelToDto(productService.findById(id).get());
        productService.deleteById(productDto.getId())
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

 */


    /*

   @GetMapping("products/{id}")
    public ResponseEntity<List<ProductDto>> findAll() {
        return ResponseEntity.ok(productMapper.toProductDTOs(productService.findAll()));
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id) {
        Optional<Product> product = productService.findById(id);

        return ResponseEntity.ok(productMapper.toProductDTO(product.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable Long id, @RequestBody ProductDto productDTO) {
        Product product = productMapper.toProduct(productDTO);
        product.setId(id);

        productService.save(product);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productDTO);


    }

     */


    /*
    @Autowired
    private ProductServiceimpl service;

  @GetMapping("/{id}")
public Product getOne(@PathVariable("id") long id){
return service.getOne(id);
}
@GetMapping("/all")
public List<Product> getAll(){
return service.getAll();
}

@PostMapping("/create")
public Product save(@RequestBody Product prd) {
return service.save(prd);
}
@PutMapping("/update")
public Product modify(@RequestBody Product prd){
return service.modify(prd);
}
@DeleteMapping("/{id}")
public void remove(@PathVariable("id") long idPrd)
{
  service.remove(idPrd);
}

*/

}
