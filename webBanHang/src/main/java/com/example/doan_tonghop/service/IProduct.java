package com.example.doan_tonghop.service;

import com.example.doan_tonghop.model.ProductDTO;

import java.util.List;

public interface IProduct {
    List<ProductDTO> findAll();
    void add(ProductDTO productDTO);
    void update(ProductDTO productDTO);
    void delete(ProductDTO productDTO);
    ProductDTO getOne(Long id);
}
