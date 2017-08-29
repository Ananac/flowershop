package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;

import java.util.List;

public interface FlowerDAO {
    Flower get(Long id);

    List<Flower> getByPrice(double price);

    String getQuantityByName(String name, int quantity);

    void updateQuantity(Long id, int quantity);

}
