package com.accenture.flowershop.be.access.order;

import com.accenture.flowershop.be.entity.order.Order;
import com.accenture.flowershop.be.entity.user.User;

import java.util.Date;
import java.util.List;

public interface OrderDAO {
    Order get(Long id);

    void create(Order order);

    void update(Order order);

    void delete(Long id);


    String getOrderByUser(User user);

}

