package com.accenture.flowershop.be.access.user;

import com.accenture.flowershop.be.entity.user.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Component
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager em;


    public User get(String username) {
        return null;
    }


    public User create(User user) {
        try {
            em.persist(user);
            return user;
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public void update(User user) {

    }
}
