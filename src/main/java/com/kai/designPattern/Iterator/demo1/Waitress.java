package com.kai.designPattern.Iterator.demo1;
/**
 * @Auther: Kai Wang
 * @Date: 2020/11/26
 * @Description:
 */
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;


    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            System.out.println(menuItem.getName() +" ");
            System.out.println(menuItem.getPrice() +" ");
            System.out.println(menuItem.getDescription());

        }

        for (int i = 0; i <dinerMenu.getMenuItems().length; i++) {
            MenuItem menuItem = dinerMenu.getMenuItems()[i];
            System.out.println(menuItem.getName() +" ");
            System.out.println(menuItem.getPrice() +" ");
            System.out.println(menuItem.getDescription());
        }
    }
}
