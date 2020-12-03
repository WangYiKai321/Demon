package com.kai.designPattern.Iterator.demo2;
import lombok.Getter;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/26
 * @Description:
 */
@Getter
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
}
