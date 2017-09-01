package com.accenture.flowershop.be.entity.flower;


import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cust")
    @SequenceGenerator(name = "seq_cust", sequenceName = "seq_cust", allocationSize = 1)
    private Long id;
    @Getter
    private String name;
    @Getter
    private String description;
    @Getter
    private BigDecimal price;
    @Getter
    private int quantity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
