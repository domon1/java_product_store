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
@Table(name = "product_group")
public class ProductGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;
    @Column(name = "group_name")
    private String name;

    // links
    @OneToMany(mappedBy = "group", cascade = {CascadeType.PERSIST})
    private Set<ProductCategoryEntity> categories = new HashSet<>();
}
