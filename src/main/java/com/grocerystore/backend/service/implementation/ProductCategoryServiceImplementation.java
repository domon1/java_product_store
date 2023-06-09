package com.grocerystore.backend.service.implementation;

import com.grocerystore.backend.repository.ProductCategoryRepository;
import com.grocerystore.backend.service.ProductCategoryService;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImplementation implements ProductCategoryService {
    private final ProductCategoryRepository repository;

    public ProductCategoryServiceImplementation(ProductCategoryRepository repository) {
        this.repository = repository;
    }
}
