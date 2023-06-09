package com.grocerystore.backend.service.implementation;

import com.grocerystore.backend.repository.ProductDescriptionRepository;
import com.grocerystore.backend.service.ProductDescriptionService;
import org.springframework.stereotype.Service;

@Service
public class ProductDescriptionServiceImplementation implements ProductDescriptionService {
    private final ProductDescriptionRepository repository;

    public ProductDescriptionServiceImplementation(ProductDescriptionRepository repository) {
        this.repository = repository;
    }
}
