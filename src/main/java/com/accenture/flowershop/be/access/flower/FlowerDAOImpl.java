package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.List;

@Component
public class FlowerDAOImpl implements FlowerDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Flower> getFlowers() {
        List<Flower> flowers = null;
        try {
            TypedQuery<Flower> query = em.createQuery("select f from Flower f", Flower.class);
            flowers = query.getResultList();
            return flowers;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public Flower getByName(String name) {
        TypedQuery<Flower> query = em.createQuery("select f from Flower f where f.name=:name", Flower.class);
        query.setParameter("name", name);
        Flower flower = query.getSingleResult();

        return flower;
    }

    @Override
    public void updateQuantity(Long id, int quantity) {

    }

    public List<Flower> getByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        TypedQuery<Flower> query = em.createQuery("select f from Flower f where f.price >= :minPrice and" +
                "  f.price <= :maxPrice", Flower.class);
        List<Flower> flowers = query.getResultList();

        return flowers;
    }


    public Flower update(Flower flower) {
        return null;
    }
}
