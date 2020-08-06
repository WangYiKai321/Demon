package com.kai.guava;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * @Author: Kai Wang
 * @Date: 11/15/19 14:52
 */
public class GuavaOrdering {
    public static void main(String[] args) {

       /* //构造一个比较器，先根据字符串长度排序，再按照字典序排序，null值置前
        Ordering<String> ordering = Ordering.natural()
                .onResultOf((String str) -> {
                    //使用Optional处理null值
                    return Optional.fromNullable(str).or("").length();
                })
                .compound(Ordering.natural().nullsFirst()); //compound用于合并两个Ordering
        ArrayList<String> names = Lists.newArrayList("Ram", "Shyam", "Mohan", "Sohan",
                "Ramesh", "Suresh", "Naresh", "Mahesh", null, "", "Vikas", "Deepak");
        Collections.sort(names, ordering);
        System.out.println(names);*/
    }

}
