package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;

import java.math.BigDecimal;
import java.util.List;

public interface FlowerDAO {
    Flower get(String name);
    List<Flower> getByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
    void updateQuantity(Long id, int quantity);

}
