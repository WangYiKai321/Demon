package com.kai.designPattern.Iterator.demo2;
import java.util.ArrayList;

import lombok.Getter;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/26
 * @Description:
 */
@Getter
public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;

        addItem("KB's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancake Breakfast",
                "Pancakes with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public PancakeHouseIterator createIterator(){
        return  new PancakeHouseIterator(menuItems);
    }

}
