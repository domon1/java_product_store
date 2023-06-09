package com.grocerystore.backend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product_compound")
public class ProductCompoundEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compound_id")
    private Long id;
    @Column(name = "product_nutritional_count")
    private Double nutritionalCount;
    @Column(name = "product_protein_count")
    private Double proteinCount;
    @Column(name = "product_fats_count")
    private Double fatsCount;
    @Column(name = "product_carbohydrates_count")
    private Double carbohydratesCount;

    // links
    @OneToMany(mappedBy = "compound", cascade = {CascadeType.PERSIST})
    private Set<ProductEntity> products = new HashSet<>();
}
