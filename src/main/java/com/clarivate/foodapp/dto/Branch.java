package com.clarivate.foodapp.dto;

import javax.persistence.ManyToOne;

public class Branch {
    private int id;
    private String name;
    private String address;
    private double phoneNumber;
    private String email;

    @ManyToOne
    User user("Admin");

}
