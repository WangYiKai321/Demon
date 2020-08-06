package com.kai.guava;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Kai Wang
 * @Date: 11/15/19 14:27
 */
public class OrderingDemo {
    public static void main(String[] args) {
//        List<Integer> list;
//        list = Arrays.asList(1, 3, 2, 4, null);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        //上述代码有问题，Collections.sort 会出现空指针问题
        List<Integer> list = Arrays.asList(1, 3, 2, 4,null);
        System.out.println(list);
        //将null放到第一个
        Collections.sort(list, Ordering.natural().nullsFirst());
        System.out.println(list);
        //判断list是否是有序
        System.out.println(Ordering.natural().nullsFirst().isOrdered(list));
        //倒序
        //Ordering.natural().reverse().nullsFirst()

    }

}
