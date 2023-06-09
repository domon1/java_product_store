package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductDescriptionEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductDescriptionRepository extends ReactiveCrudRepository<ProductDescriptionEntity, Long> {
}
