package com.grocerystore.backend.repository;

import com.grocerystore.backend.domain.ProductGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductGroupRepository extends JpaRepository<ProductGroupEntity, Long> {
}
