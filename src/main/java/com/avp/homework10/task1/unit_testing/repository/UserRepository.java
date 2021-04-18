package com.avp.homework10.task1.unit_testing.repository;

import com.avp.homework10.task1.unit_testing.bean.User;

import java.util.Map;

public class UserRepository {

    private Map<String, User> users;

    public void save(User user) {
        users.put(user.getId(), user);
    }

    public Map<String, User> getMap() {
        return users;
    }
}
