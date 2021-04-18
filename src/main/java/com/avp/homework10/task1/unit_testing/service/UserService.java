package com.avp.homework10.task1.unit_testing.service;

import com.avp.homework10.task1.unit_testing.bean.User;
import com.avp.homework10.task1.unit_testing.repository.MockUserRepository;
import com.avp.homework10.task1.unit_testing.repository.UserRepository;

public class UserService {

    private final MockUserRepository mockUserRepository;

    public UserService(MockUserRepository mockUserRepository) {
        this.mockUserRepository = mockUserRepository;
    }

    public void addUser(User user) {
        if (user != null) {
            mockUserRepository.save(user);
        }
    }

}
