package com.avp.homework6_exceptions.task1_UserValidationService.service;

import com.avp.homework6_exceptions.task1_UserValidationService.bean.User;
import com.avp.homework6_exceptions.task1_UserValidationService.exceptions.UserValidationException;

public class UserValidationService {

    public void validate(User user) {
        if (user.getFirstName().length() < 3 || user.getFirstName().length() > 15) {
            throw new UserValidationException("It's wrong data. Try again");
        }
        if (user.getLastName().length() < 3 || user.getLastName().length() > 15) {
            throw new UserValidationException("It's wrong data. Try again");
        }
        if (user.getAge() < 0 || user.getAge() > 120) {
            throw new UserValidationException(new RuntimeException());
        }
    }
}
