package com.accenture.flowershop.be.access.user;

import com.accenture.flowershop.be.entity.user.User;

import java.util.List;

public interface UserDAO {
    User get(String userName);
    void create(User user);
    void update(User user);
    void delete(String userName);

    void updateEmail(String userName, String newEmailAddress);
    void updateFullName(String userName, String fullName);
    void updatePassword(String userName, String password, String newPassword);
    void updateAddressName(String userName, String address);
    void updateDiscount(String userName, int discount);
    void updateBalance(String userName, double balance);
    List getUsersByAddress(String address);
    List getUsersByFullName(String fullName);
    List getUsersByDiscount(int discount);
    String getUserByEmail(String email);
}
