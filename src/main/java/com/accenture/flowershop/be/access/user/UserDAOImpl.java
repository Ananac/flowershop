package com.accenture.flowershop.be.access.user;

import com.accenture.flowershop.be.entity.user.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Component
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager em;


    public User get(String username) {
        return null;
    }

    public User getByUsername(String username) {
        try {
            TypedQuery<User> query = em.createQuery("select u from User u where u.username=:username", User.class);
            query.setParameter("username", username);
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    public User getByUsernameAndPassword(String username, String password) {
        try {
            TypedQuery<User> query = em.createQuery("select u from User u where u.username=:username and " +
                    "u.password=:password", User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            User user = query.getSingleResult();
            return user;
        } catch (NoResultException ex) {
            return null;
        }
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
