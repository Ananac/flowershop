package com.accenture.flowershop.be.access.user;

import com.accenture.flowershop.be.entity.user.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserDAO {

    User get(String username);

    User getByUsername(String username);


    @Transactional
    User getByUsernameAndPassword(String username, String password);

    @Transactional
    User create(User user);

    @Transactional
    User update(User user);
}
