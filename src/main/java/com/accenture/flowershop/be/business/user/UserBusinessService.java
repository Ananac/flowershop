package com.accenture.flowershop.be.business.user;

import com.accenture.flowershop.be.entity.user.User;
import org.springframework.stereotype.Component;

@Component
public interface UserBusinessService {
    User login(String username, String password);

    User register(String username, String password, String fullName, String city, int zipcode, String address);

    User updateUser(User user);

    User getInfo(String username);
}
