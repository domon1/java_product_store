package com.grocerystore.backend.service.implementation;

import com.grocerystore.backend.repository.ProductRepository;
import com.grocerystore.backend.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImplementation(ProductRepository repository) {
        this.repository = repository;
    }
}
