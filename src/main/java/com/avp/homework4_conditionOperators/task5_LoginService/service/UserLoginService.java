package com.avp.homework4_conditionOperators.task5_LoginService.service;

import com.avp.homework4_conditionOperators.task5_LoginService.bean.User;

public class UserLoginService {

    public boolean login(User user, String password) {
        if (comparePasswords(user, password)) {
            if (!isUserBlocked(user)) {
                resetCountOfLoginAttempts(user);
                return true;
            }
            return false;
        } else {
            decrementCountOfLoginAttempts(user);
            if(!isLoginAttemptsLeft(user)) {
                blockUser(user);
            }
            return false;
        }
    }

    public boolean comparePasswords(User user, String password) {
        return user.getPassword().equals(password);
    }

    public User blockUser(User user) {
        user.setBlocked(true);
        return user;
    }

    public User resetCountOfLoginAttempts(User user){
        user.setCountOfLoginAttempts(3);
        return user;
    }

    public boolean isUserBlocked(User user) {
        return user.isBlocked();
    }

    public User decrementCountOfLoginAttempts(User user) {
        user.setCountOfLoginAttempts(user.getCountOfLoginAttempts() - 1);
        return user;
    }

    public boolean isLoginAttemptsLeft(User user) {
        return user.getCountOfLoginAttempts() > 0;
    }
}
