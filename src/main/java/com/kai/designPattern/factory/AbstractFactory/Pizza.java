package com.kai.designPattern.factory.AbstractFactory;
import java.util.Arrays;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/16
 * @Description:
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
               "name='" + name + '\'' +
               ", dough=" + dough +
               ", sauce=" + sauce +
               ", veggies=" + Arrays.toString(veggies) +
               ", cheese=" + cheese +
               ", pepperoni=" + pepperoni +
               ", clams=" + clams +
               '}';
    }
}
