package com.jk.webapp.CrudOperation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor  // Added to have a no-argument constructor (required by JPA)
public class Product {

    @Id

    private int prodId;
    private String prodName;
    private int price;

}
