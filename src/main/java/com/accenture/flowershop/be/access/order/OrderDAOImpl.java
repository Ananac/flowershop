package com.accenture.flowershop.be.access.order;

import com.accenture.flowershop.be.entity.order.Order;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class OrderDAOImpl implements OrderDAO {
    @PersistenceContext
    private EntityManager em;

    public Order get(Long id) {
        return null;
    }


    public void create(Order order) {

    }


    public void update(Order order) {

    }


    public void delete(Long id) {

    }


    public String getOrderByUser(User user) {
        return null;
    }
}
