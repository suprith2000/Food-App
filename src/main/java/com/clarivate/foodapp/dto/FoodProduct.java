package com.clarivate.foodapp.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class FoodProduct {

    private int id;
    private String name;
    private String type;
    private String about;
    private String availability;
    private float price;

    @ManyToOne
    @JoinColumn
    Menu menu;

}
