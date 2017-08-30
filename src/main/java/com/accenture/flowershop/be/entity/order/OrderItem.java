package com.accenture.flowershop.be.entity.order;

import com.accenture.flowershop.be.entity.flower.Flower;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderItem {
    @Id
    private Long id;
    private Long orderId;
    private Flower flower;
    private int amount;

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
