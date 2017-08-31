package com.accenture.flowershop.be.entity.flower;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cust")
    @SequenceGenerator(name = "seq_cust", sequenceName = "seq_cust", allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
}
