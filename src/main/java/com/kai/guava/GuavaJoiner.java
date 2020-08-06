package com.kai.guava;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import static com.google.common.collect.ImmutableBiMap.of;

/**
 * @Author: Kai Wang
 * @Date: 11/18/19 9:34
 */
public class GuavaJoiner {

    private static final List<String> lists = Arrays.asList("A", "B", "C", "D");

    private static final List<String> listsWithNull = Arrays.asList("A", "B", "C", null);

    private static final String targetFileName = "D:\\BaiduNetdiskDownload\\guava\\guava.txt";

    private static final Map<String, String> stringMap = of("key1", "value1", "key2", "value2", "key3", "value3");

    public static void main(String[] args) {
        String result = Joiner.on(",").join(lists);
        System.out.println(result);

        String result1 = Joiner.on(",").skipNulls().join(listsWithNull);
        System.out.println(result1);

        String result2 = Joiner.on(",").useForNull("JAVA").join(listsWithNull);
        System.out.println(result2);

        StringBuilder result3 = Joiner.on(",").useForNull("JAVA").appendTo(new StringBuilder(), listsWithNull);
        System.out.println(result3);

        String result4 = Joiner.on("#").withKeyValueSeparator("=").join(stringMap);
        System.out.println(result4);
    }

}
