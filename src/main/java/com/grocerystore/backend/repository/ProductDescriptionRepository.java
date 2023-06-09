package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductDescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDescriptionRepository extends JpaRepository<ProductDescriptionEntity, Long> {
}
