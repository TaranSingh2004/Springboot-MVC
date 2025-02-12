package org.example.HelloWorld.service;

import org.example.HelloWorld.model.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> products = Arrays.asList(new Products(101, "dell", 60000.00),
            new Products(102, "hp", 75000.00),
            new Products(103, "lenovo", 40000.00));

    public List<Products> getAllProducts(){
        return products;
    }
}
