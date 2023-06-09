package com.grocerystore.backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private Double price;

    // links
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategoryEntity category;
    @ManyToOne
    @JoinColumn(name = "description_id")
    private ProductDescriptionEntity description;
    @ManyToOne
    @JoinColumn(name = "compound_id")
    private ProductCompoundEntity compound;
    @ManyToOne
    @JoinColumn(name = "rating_id")
    private ProductRatingEntity rating;
}
