package com.grocerystore.backend.service.implementation;

import com.grocerystore.backend.repository.ProductCompoundRepository;
import com.grocerystore.backend.service.ProductCompoundService;
import org.springframework.stereotype.Service;

@Service
public class ProductCompoundServiceImplementation implements ProductCompoundService {
    private final ProductCompoundRepository repository;

    public ProductCompoundServiceImplementation(ProductCompoundRepository repository) {
        this.repository = repository;
    }
}
