package com.accenture.flowershop.be.business.flower;

import com.accenture.flowershop.be.entity.flower.Flower;

import java.math.BigDecimal;
import java.util.List;

public class FlowerBusinessServiceImpl implements FlowerBusinessService {
    @Override
    public boolean checkAvailability(Long id, int amount) {
        return false;
    }

    @Override
    public Flower getFlower(String name) {
        return null;
    }

    @Override
    public List<Flower> getFlowerByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return null;
    }

    @Override
    public String getFlowersQuantityByName(String name, int quantity) {
        return null;
    }

    @Override
    public void updateFlowersQuantity(Long id, int quantity) {

    }
}
