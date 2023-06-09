package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductGroupEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductGroupRepository extends ReactiveCrudRepository<ProductGroupEntity, Long> {
}
