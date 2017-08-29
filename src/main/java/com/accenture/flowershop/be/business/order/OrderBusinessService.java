package com.accenture.flowershop.be.business.order;

import com.accenture.flowershop.be.entity.flower.Flower;

public interface OrderBusinessService {
    void addItem(Flower item);
    void deleteItem(Flower item);
    void calculateSubtotal();
    void checkoutOrder();
}
