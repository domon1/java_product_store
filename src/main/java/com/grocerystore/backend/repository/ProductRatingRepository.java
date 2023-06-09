package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductRatingEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRatingRepository extends ReactiveCrudRepository<ProductRatingEntity, Long> {
}
