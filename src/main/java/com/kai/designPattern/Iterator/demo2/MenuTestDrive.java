package com.kai.designPattern.Iterator.demo2;
import java.util.ArrayList;



/**
 * @Auther: Kai Wang
 * @Date: 2020/11/26
 * @Description:
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(menuItems);
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
