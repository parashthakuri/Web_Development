package com.system.parashEcommerce.service;


import com.system.parashEcommerce.entity.User;
import com.system.parashEcommerce.pojo.PasswordChangePojo;
import com.system.parashEcommerce.pojo.UserPojo;

import java.util.List;

public interface UserService {

    void sendEmail();

    void saveUser(UserPojo userPojo);
    List<User> fetchAll();
    User fetchById(Integer id);
    User findByEmail(String email);
    void changePassword(PasswordChangePojo passwordChangePojo);
    void deleteAccount(Integer id);

    void deleteById(Integer id);

    String update(UserPojo userPojo);
    void processPasswordResetRequest(String email);

    void resetPassword(String email, String OTP, String password);
}

