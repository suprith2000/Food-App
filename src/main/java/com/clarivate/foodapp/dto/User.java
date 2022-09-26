package com.clarivate.foodapp.dto;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String role;

    public User(String role) {
        this.role = role;
    }

    @OneToOne
    Menu menu;

    @OneToMany(mappedBy="user")
    List<Branch> branch;

    @OneToMany(mappedBy = "user")
    List<FoodOrder> foodOrders;


}
