package com.slb.spring.boot.service;

import com.slb.spring.boot.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User createUser(User user) {
        //we are just returning dummy user here
        return createDummyUser();
    }

    @Override
    public User getUser(String userId) {
        return createDummyUser();
    }

    private User createDummyUser(String name, String id, String address){
        return new User(name,"12","TEST ADDRESS");
    }

    private User createDummyUser(){
        return new User("SLB","12","TEST ADDRESS");
    }

    @Override
    public List<User> getUsers() {
        //later will get all these details from db/file/service, etc
        ArrayList<User> users = new ArrayList<>();
        users.add(createDummyUser("abc","2","test1"));
        users.add(createDummyUser("tes","3","test1"));
        users.add(createDummyUser("res","4","test1"));
        users.add(createDummyUser("tse","5","test1"));

        return users;
    }

}
