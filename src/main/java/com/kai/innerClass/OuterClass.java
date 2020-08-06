package com.kai.innerClass;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @Auther: Kai Wang
 * @Date: 2020/08/03
 * @Description:
 */
public class OuterClass {
    private final static Integer i = 0;


    class InnerClass {
        private static final int i = 0;//正确，常量的调用不会导致Person类加载，也就是说不依赖于Person
    }

    /*class InnerClass1 {
        static int i = 0;//错误，Inner依赖于外部对象的创建，所以i也依赖于Person的创建，不符合静态变量必须不依赖于任何对象的定义
    }*/

    static class InnerClass2 {
        static int i = 0;//正确，Inner不依赖于Person对象，i既不依赖于Inner，也不依赖于Person对象
    }

}
