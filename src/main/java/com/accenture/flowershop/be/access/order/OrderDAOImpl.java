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

    @Override
    public Order get(Long id) {
        return null;
    }

    @Override
    public void create(Order order) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public String getOrderByUser(User user) {
        return null;
    }
}
