package com.accenture.flowershop.be.business.user;

import com.accenture.flowershop.be.access.user.UserDAO;
import com.accenture.flowershop.be.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserBusinessServiceImpl implements UserBusinessService {
    @Autowired
    UserDAO dao;

    @Override
    public User login(String username, String password) {

        if (dao.getByUsernameAndPassword(username, password) != null) {
            return dao.getByUsername(username);
        }
        return null;
    }

    @Override
    public User register(String username, String password, String fullName, String city, String address) {
        User u = new User(username, password, fullName, city, address);

        if (dao.getByUsername(username) == null && !(username.equals(null)) && !(password.equals(null)) &&
                !(fullName.equals(null)) && !(city.equals(null)) && !(address.equals(null))) {
            dao.create(u);
            return u;
        }
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
