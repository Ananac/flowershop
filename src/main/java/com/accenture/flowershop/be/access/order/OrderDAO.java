package com.accenture.flowershop.be.access.order;

import com.accenture.flowershop.be.entity.order.Order;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface OrderDAO {
    @Transactional
    List<Order> getOrders();

    @Transactional
    Order create(Order order);

    void update(Order order);

    void delete(Long id);

    List<Order> getOrderByUser(User user);

}

