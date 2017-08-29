package com.accenture.flowershop.be.access.user;

import com.accenture.flowershop.be.entity.user.User;

import java.util.List;

public interface UserDAO {
    User get(Long id);

    void create(User user);

    void update(User user);
}
