package com.example.demo.controllers;


import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") int theId, Model theModel) {
        long theidl;
        theidl = theId;
        Optional<Product> product = productRepository.findById(theidl);

        if (product.isPresent()) {
            Product product1 = product.get();
            if (product1.getInv() > 0) {
                int currentInv = product1.getInv();
                currentInv = currentInv - 1;
                product1.setInv(currentInv);
                productRepository.save(product1);
                return "confirmationbuyproduct";
            } else {
                return "confirmationbuyerror";
            }
        }
        return "confirmationbuyerror";
    }
}


