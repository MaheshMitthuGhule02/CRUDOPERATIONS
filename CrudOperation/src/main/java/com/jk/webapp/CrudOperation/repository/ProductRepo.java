package com.jk.webapp.CrudOperation.repository;

import com.jk.webapp.CrudOperation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


}
