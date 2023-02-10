package com.slb.spring.boot.service;

import com.slb.spring.boot.domain.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUser(String userId);
    List<User> getUsers();
}
