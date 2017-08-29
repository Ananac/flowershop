package com.accenture.flowershop.fe.dto.order;

import com.accenture.flowershop.be.entity.flower.Flower;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private Date orderDate;
    private int orderNum;
    private List<Flower> Items;
    private double subTotal;

}
