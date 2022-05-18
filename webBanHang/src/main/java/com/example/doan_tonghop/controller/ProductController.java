package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.entity.ProductEntity;
import com.example.doan_tonghop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/")
    public String home(Model model)
    {
        List<ProductEntity> product = productRepository.findAll();
        model.addAttribute("pList", product);
        return "home";
    }
}
