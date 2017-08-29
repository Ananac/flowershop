package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;

import java.util.List;

public interface FlowerDAO {
    Flower get(String name);
    void create(Flower flower);
    void update(Flower flower);
    void delete(String name);

    List getByPrice(double price);
    List getFlowerByPriceRange(double minPrice, double maxPrice);
    String getQuantityByName (String name, int quantity);
    void dupdateQuantity(String name, int quantity);
    void updatePrice(String name, double price);
    void updateDescription(String name, String description);
    void deleteFlowerByPriceRange(double minPrice, double maxPrice);

}
