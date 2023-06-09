package com.grocerystore.backend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product_description")
public class ProductDescriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "description_id")
    private Long id;
    @Column(name = "product_net_weight")
    private Integer netWeight;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "product_volume")
    private Double volume;
    @Column(name = "product_expiration_date")
    private Integer expirationDate;
    @Column(name = "product_shelf_life_after_opening")
    private Integer shelfLifeAfterOpening;
    @Column(name = "product_storage_temperature_min")
    private Integer storageTemperatureMin;
    @Column(name = "product_storage_temperature_max")
    private Integer storageTemperatureMax;
    @Column(name = "product_article_number")
    private Integer articleNumber;

    // links
    @OneToMany(mappedBy = "description", cascade = {CascadeType.PERSIST})
    private Set<ProductEntity> products = new HashSet<>();
}
