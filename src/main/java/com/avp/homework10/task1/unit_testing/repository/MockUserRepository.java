package com.avp.homework10.task1.unit_testing.repository;

import com.avp.homework10.task1.unit_testing.bean.User;

public class MockUserRepository extends UserRepository{

    private boolean isMockTriggered;

    @Override
    public void save(User user) {
//        UserRepository userRepository = new UserRepository();
//        userRepository.save(user);
////        if (userRepository.getMap().size() > 0) {
////            isMockTriggered = true;
////        }
        isMockTriggered = true;
    }

    public boolean getIsMockTriggered() {
        return isMockTriggered;
    }
}
