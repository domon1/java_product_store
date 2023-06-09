package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductRatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRatingRepository extends JpaRepository<ProductRatingEntity, Long> {
}
