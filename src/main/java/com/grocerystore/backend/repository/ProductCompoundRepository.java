package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductCompoundEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductCompoundRepository extends ReactiveCrudRepository<ProductCompoundEntity, Long> {
}
