package com.kai.guava;

import com.google.common.base.CharMatcher;

/**
 * @Author: Kai Wang
 * @Date: 11/18/19 10:35
 */
public class GuavaCharMatcher {

    public static void main(String[] args) {
        System.out.println(CharMatcher.DIGIT.retainFrom("mahesh123")); //只保留数字字符
        System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom("     Mahesh     Parashar ", ' '));
        //去除两端的空格，并把中间的连续空格替换成单个空格
        System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("mahesh123", "*")); //用*号替换所有数字
        System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("Mahesh123"));
        // 只保留数字和小写字母
        String testString = "cust_po_1:1:1";
        String test = testString.substring(0,testString.indexOf(":"));
        System.out.println(test);


    }
}
