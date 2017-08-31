package com.accenture.flowershop.be.entity.flower;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Flower {
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
}
