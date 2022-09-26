package com.clarivate.foodapp.dto;

public class Menu {

    private int id;

    @OneToMany(mappedBy="menu")
    List<FoodProduct> foodProduct;

    @OneToOne
    @JoinColumn
    User user("BranchManager");
}
