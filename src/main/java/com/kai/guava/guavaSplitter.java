package com.kai.guava;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.Map;

/**
 * @Author: Kai Wang
 * @Date: 11/18/19 10:15
 */
public class guavaSplitter {
    public static void main(String[] args) {

        //去除分隔结果的前后空格，trimResults()
        String str = "a, b ,     c,,d";
        Iterable<String> result = Splitter.on(',')//设置分隔符
                .trimResults() //去除前后空格
                .omitEmptyStrings() //用于去除为空格的分割结果
                .split(str); //要分割的字符串
        System.out.println("--start--");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("--end--");


        //去除分隔结果为空格的数据,使用omitEmptyStrings
        String str1 = "a,b,     c,,d";
        Iterable<String> result1 = Splitter.on(',')//设置分隔符
                .omitEmptyStrings() //用于去除为空格的分割结果
                .split(str); //要分割的字符串
        System.out.println("--start--");
        for (String s : result1) {
            System.out.println(s);
        }
        System.out.println("--end--");

        //使用Splitter方法把string转换为list
        String input = "apple - banana - orange";
        List<String> resultList = Splitter.on("-")
                .trimResults()
                .splitToList(input);
        System.out.println("--start--");
        for (String string : resultList) {
            System.out.println(string);
        }
        System.out.println("--end--");

        //使用Splitter将string转为map
        String input1 = "John=first,Adam=second";
        Map<String, String> resultMap = Splitter.on(",")//
                .withKeyValueSeparator("=")//
                .split(input1);//

        for (Map.Entry<String,String> entry :resultMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
