package com.accenture.flowershop.be.entity.user;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cust")
    @SequenceGenerator(name = "seq_cust", sequenceName = "seq_cust", allocationSize = 1)
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String city;
    private int zipCode;
    private String address;
    private BigDecimal balance;
    private int discount;
    private boolean isAdmin;
}
