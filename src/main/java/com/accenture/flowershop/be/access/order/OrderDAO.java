package com.accenture.flowershop.be.access.order;

import com.accenture.flowershop.be.entity.order.Order;
import com.accenture.flowershop.be.entity.user.User;

import java.util.Date;
import java.util.List;

public interface OrderDAO {
    Order get(String id);
    void create(Order order);
    void update(Order order);
    void delete(String id);

    String getOrderByOrderNum(int orderNum);
    String getOrderByUser(User user);
    List getOrderByDate(Date date);
    List getOrderBySubtotalRange(int minSubtotal, int maxSubTotal);
    void deleteOrderByUser(User user);

}

