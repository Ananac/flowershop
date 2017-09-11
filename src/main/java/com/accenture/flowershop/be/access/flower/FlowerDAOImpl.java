package com.accenture.flowershop.be.access.flower;

import com.accenture.flowershop.be.entity.flower.Flower;
import com.accenture.flowershop.be.entity.user.User;
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

    public Flower getById(Long id) {
        try {
            TypedQuery<Flower> query = em.createQuery("select f from Flower f where f.id=:id", Flower.class);
            query.setParameter("id", id);
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }



    public Flower update(Flower flower) {
        try {
            return em.merge(flower);
        } catch (NoResultException ex) {
            return null;
        }
    }
}

