package com.accenture.flowershop.be.business.order;

import com.accenture.flowershop.be.entity.order.Order;

public interface OrderBusinessService {

    void createOrder(Order order);

    void updateStatus(Order order);

    void deleteOrder(Order order);
}
