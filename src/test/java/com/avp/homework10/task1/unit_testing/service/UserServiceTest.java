package com.avp.homework10.task1.unit_testing.service;

import com.avp.homework10.task1.unit_testing.bean.User;
import com.avp.homework10.task1.unit_testing.repository.MockUserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final User testUser = new User("1", "hkih", 27 );
    private final MockUserRepository mockUserRepositoryTest = new MockUserRepository();
    private final UserService userService = new UserService(mockUserRepositoryTest);

    @Test
    void addUser() {
        userService.addUser(testUser);
        assertTrue(mockUserRepositoryTest.getIsMockTriggered());
    }
}