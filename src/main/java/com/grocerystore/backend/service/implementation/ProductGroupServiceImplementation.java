package com.grocerystore.backend.service.implementation;

import com.grocerystore.backend.repository.ProductGroupRepository;
import com.grocerystore.backend.service.ProductGroupService;
import org.springframework.stereotype.Service;

@Service
public class ProductGroupServiceImplementation implements ProductGroupService {
    private final ProductGroupRepository repository;

    public ProductGroupServiceImplementation(ProductGroupRepository repository) {
        this.repository = repository;
    }
}
