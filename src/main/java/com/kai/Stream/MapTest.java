package com.kai.Stream;
import java.util.Map;

import com.google.common.collect.Maps;
import com.kai.vo.Student;

/**
 * @Auther: Kai Wang
 * @Date: 2020/08/06
 * @Description:
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Student> map = Maps.newHashMap();
        map.put("1",new Student());
        Student student = map.get(1);
        System.out.println(student);
    }
}
