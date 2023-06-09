package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductCompoundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCompoundRepository extends JpaRepository<ProductCompoundEntity, Long> {
}
