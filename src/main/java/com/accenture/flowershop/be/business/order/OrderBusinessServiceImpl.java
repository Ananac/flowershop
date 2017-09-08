package com.accenture.flowershop.be.business.order;

import com.accenture.flowershop.be.access.order.OrderDAO;
import com.accenture.flowershop.be.access.user.UserDAO;
import com.accenture.flowershop.be.entity.order.Order;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class OrderBusinessServiceImpl implements OrderBusinessService {
    @Autowired
    OrderDAO dao;


    public Order newOrder(User user, BigDecimal subTotal) {
        Order o = new Order(user, subTotal);
        dao.create(o);
        return o;
    }


    public List<Order> getAllOrders() {
        List<Order> o = dao.getOrders();
        return o;
    }


    public void completeOrder(Long id) {
        Order o = dao.getById(id);
        o.setStatus(Order.status.COMPLETED);
        o.setCompleteDate(new Date());
        dao.update(o);
    }


    public void deleteOrder(Order order) {

    }


    public List<Order> getOrdersByUser(User user) {
        List<Order> o = dao.getOrderByUser(user);
        return o;
    }
}
