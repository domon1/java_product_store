package com.grocerystore.backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product_category")
public class ProductCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;
    @Column(name = "category_name")
    private String name;

    // links
    @ManyToOne
    @JoinColumn(name = "group_id")
    private ProductGroupEntity group;
    @OneToMany(mappedBy = "category", cascade = {CascadeType.PERSIST})
    private Set<ProductEntity> products = new HashSet<>();
}
