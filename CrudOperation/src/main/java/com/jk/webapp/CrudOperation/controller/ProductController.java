package com.jk.webapp.CrudOperation.controller;

import com.jk.webapp.CrudOperation.model.Product;
import com.jk.webapp.CrudOperation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product>getProducts(){
        return service.getProduct();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable Integer prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void  addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println("in here in Update");
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }




}
