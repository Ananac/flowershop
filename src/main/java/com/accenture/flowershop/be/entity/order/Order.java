package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    private Long id;
    private Long userId;
    private Date orderDate;
//    List<OrderItem> items;
    private BigDecimal subTotal;
}

