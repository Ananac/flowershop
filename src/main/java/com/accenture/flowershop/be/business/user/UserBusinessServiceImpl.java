package com.accenture.flowershop.be.business.user;

import com.accenture.flowershop.be.access.user.UserDAO;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class UserBusinessServiceImpl implements UserBusinessService {
    @Autowired
    UserDAO dao;


    public User login(String username, String password) {

        if (dao.getByUsernameAndPassword(username, password) != null) {
            return dao.getByUsername(username);
        }
        return null;
    }


    public User register(String username, String password, String fullName, String city, int zipcode, String address) {
        User u = new User(username, password, fullName, city, zipcode, address);

        if (dao.getByUsername(username) == null) {
            dao.create(u);
            return u;
        }
        return null;
    }


    public User updateBalance(String username, BigDecimal total) {
        User u = dao.getByUsername(username);
        BigDecimal oldBalance = u.getBalance();
        u.setBalance((oldBalance.subtract(total)).setScale(2,BigDecimal.ROUND_HALF_UP));;
        dao.update(u);
        return u;
    }


    public User getInfo(String username) {
        User u = dao.getByUsername(username);
        return u;

    }
}
