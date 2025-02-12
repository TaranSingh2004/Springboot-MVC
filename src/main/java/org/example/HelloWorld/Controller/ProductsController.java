package org.example.HelloWorld.Controller;

import org.example.HelloWorld.service.ProductService;
import org.example.HelloWorld.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductsController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public String listproducts(Model model){
        model.addAttribute("products", service.getAllProducts());
        List<Products> products = service.getAllProducts();
        System.out.println("Products fetched: " + products);
        return "products";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
