package com.accenture.flowershop.be.business.user;

import com.accenture.flowershop.be.entity.user.User;

public interface UserBusinessService {
    String login(String username, String password);
    User register(String username, String email, String password, String fullName, String address);
}
