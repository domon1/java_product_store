package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductCategoryEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductCategoryRepository extends ReactiveCrudRepository<ProductCategoryEntity, Long> {
}
