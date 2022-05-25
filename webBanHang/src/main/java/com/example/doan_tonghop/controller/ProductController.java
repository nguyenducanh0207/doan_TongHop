package com.example.doan_tonghop.controller;



import com.example.doan_tonghop.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String show(Model model)
    {
        model.addAttribute("productList",productService.findAll());
        return "home";
    }

    @GetMapping("/create")
    public String create()
    {
        return "createproduct";
    }

    @PostMapping("create")
    public String createsubmit()
    {
        return "createproduct";
    }

}
