package com.accenture.flowershop.be.entity.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String fullName;
    @Getter
    @Setter
    private String city;
    @Getter
    @Setter
    private int zipcode;
    @Getter
    @Setter
    private String address;
    @Getter
    @Setter
    private BigDecimal balance =  new BigDecimal(500);
    @Getter
    @Setter
    private int discount = 0;
    @Getter
    @Setter
    private boolean isAdmin = false;

    public User() {

    }

    public User(String username, String password, String fullName, String city, int zipcode, String address) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.city = city;
        this.zipcode = zipcode;
        this.address = address;
    }

}
