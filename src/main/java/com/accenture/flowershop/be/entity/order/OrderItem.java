package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.flower.Flower;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderItem {
    @Id
    private Long id;
    private Long orderId;
    //    private Flower flower;
    private int amount;
}
