package com.accenture.flowershop.be.access.order;

import com.accenture.flowershop.be.entity.order.Order;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class OrderDAOImpl implements OrderDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Order> getOrders() {
        List<Order> orders = null;
        try {
            TypedQuery<Order> query = em.createQuery("select o from Order o ORDER BY o.status, o.createDate desc ", Order.class);
            orders = query.getResultList();
            return orders;
        } catch (NoResultException ex) {
            return null;
        }

    }


    public Order create(Order order) {
        try {
            em.persist(order);
            return order;
        } catch (NoResultException ex) {
            return null;
        }
    }


    public Order update(Order order) {
        try {
            return em.merge(order);
        } catch (NoResultException ex) {
            return null;
        }
    }

    public Order getById(Long id) {
        try {
            TypedQuery<Order> query = em.createQuery("select o from Order o where o.id=:id ORDER BY o.status, o.createDate desc ", Order.class);
            query.setParameter("id", id);
            Order order = query.getSingleResult();
            return order;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public void delete(Long id) {

    }


    public List<Order> getOrderByUser(User user) {
        List<Order> orders = null;
        try {
            TypedQuery<Order> query = em.createQuery("select o from Order o where o.user=:user ORDER BY o.status, o.createDate desc ", Order.class);
            query.setParameter("user", user);
            orders = query.getResultList();
            return orders;
        } catch (NoResultException ex) {
            return null;
        }
    }
}
