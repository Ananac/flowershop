package com.accenture.flowershop.be.entity.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String address;
    private BigDecimal balance;
    private int discount;
    private boolean isAdmin;
}
