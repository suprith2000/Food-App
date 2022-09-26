package com.clarivate.foodapp.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class FoodOrder {

    private int id;
    private String status;
    private float totalPrice;
    private String orderCreatedTime;
    private String orderDeliveryTime;
    private String customerName;
    private double contactNumber;

    @ManyToOne
    @JoinColumn
    User user("staff");

}
