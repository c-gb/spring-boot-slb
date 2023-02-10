package com.slb.spring.boot.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class User {

    String name;
    String id;
    String address;

    public User(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }
}
