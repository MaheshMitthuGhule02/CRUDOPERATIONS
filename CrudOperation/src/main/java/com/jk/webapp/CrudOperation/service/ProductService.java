package com.jk.webapp.CrudOperation.service;

import com.jk.webapp.CrudOperation.model.Product;
import com.jk.webapp.CrudOperation.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService {
@Autowired
    ProductRepo repo;

    public List<Product> getProduct() {
        return repo.findAll();
    }
    public Product getProductById(Integer prodId) {
    return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
    repo.save(prod);
    }
    public void updateProduct(Product prod){
    repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }


}
