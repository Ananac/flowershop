package com.accenture.flowershop.be.business.flower;

import com.accenture.flowershop.be.entity.flower.Flower;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
@Component
public interface FlowerBusinessService {
    boolean checkAvailability(String name, int amount);
    Flower getFlower(String name);
    List<Flower> flowersList();
    List<Flower> getFlowerByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
    void updateFlowersQuantity(Long id, int quantity);
}
