package com.grocerystore.backend.service.implementation;

import com.grocerystore.backend.repository.ProductRatingRepository;
import com.grocerystore.backend.service.ProductRatingService;
import org.springframework.stereotype.Service;

@Service
public class ProductRatingServiceImplementation implements ProductRatingService {
    private final ProductRatingRepository repository;

    public ProductRatingServiceImplementation(ProductRatingRepository repository) {
        this.repository = repository;
    }
}
