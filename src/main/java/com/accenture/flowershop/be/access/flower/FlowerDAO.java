package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;

import java.math.BigDecimal;
import java.util.List;

public interface FlowerDAO {
    List<Flower> getFlowers();
    List<Flower> getByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
    Flower getByName(String name);
    void updateQuantity(Long id, int quantity);

}
