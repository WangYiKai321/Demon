package com.kai.spring.aop;
import org.springframework.stereotype.Component;

/**
 * @Author: Kai Wang
 * @Date: 03/25/20 13:54
 */
@Component("arithmetic")
public class Arithmetic {
    //add
    public int add(int d, int e) {
        System.out.println("add method END!");
        System.out.println();
        return d + e;
    }

    //subtraction
    public int sub(int a, int b) {
        System.out.println("sub method END!");
        System.out.println();
        return a - b;
    }

    //multiplicative
    public int mul(int a, int b) {
        System.out.println("mul method END!");
        System.out.println();
        return a * b;
    }

    //division
    public int div(int a, int b) {
        System.out.println("div method END!");
        System.out.println();
        return a / b;
    }
}
