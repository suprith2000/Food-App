package com.clarivate.foodapp.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Item {

    private int id;
    private int productId;
    private String name;
    private String type;
    private int Quantity;
    private float price;

    @ManyToOne
    @JoinColumn
    FoodOreder foodOrder;

}
