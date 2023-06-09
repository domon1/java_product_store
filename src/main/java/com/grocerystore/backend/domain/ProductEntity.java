package com.grocerystore.backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    // equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id.equals(that.id) && name.equals(that.name)
                && price.equals(that.price) && category.equals(that.category)
                && description.equals(that.description) && compound.equals(that.compound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, category, description, compound);
    }
}
