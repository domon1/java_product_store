package com.grocerystore.backend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product_rating")
public class ProductRatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private Long id;
    @Column(name = "rating_estimation")
    private Integer estimation;
    @Column(name = "rating_client_name")
    private String clientName;
    @Column(name = "rating_feedback")
    private String feedback;

    // links
    @OneToMany(mappedBy = "rating", cascade = {CascadeType.PERSIST})
    private Set<ProductEntity> products = new HashSet<>();
}
