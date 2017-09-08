package com.accenture.flowershop.be.business.user;

import com.accenture.flowershop.be.entity.user.User;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface UserBusinessService {
    User login(String username, String password);

    User register(String username, String password, String fullName, String city, int zipcode, String address);

    User updateBalance(String username, BigDecimal total);

    User getInfo(String username);
}
