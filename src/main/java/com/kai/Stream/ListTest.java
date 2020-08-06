package com.kai.Stream;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.kai.vo.Student;

/**
 * @Auther: Kai Wang
 * @Date: 2020/08/06
 * @Description:
 */
public class ListTest {
    public static void main(String[] args) {
        Student student_1 = Student.builder().name("student_1").id(1).age(21).build();
        Student student_2 = Student.builder().name("student_2").id(2).age(22).build();
        Student student_3 = Student.builder().name("student_1").id(3).age(23).build();
        Student student_4 = Student.builder().name("student_1").id(4).age(23).build();
        List<Student> studentList = Lists.newArrayList();
        studentList.add(student_4);
        studentList.add(student_1);
        studentList.add(student_2);
        studentList.add(student_3);
        studentList.add(null);
        List<Student> collect = studentList.stream().filter(Objects::nonNull).filter(StreamUtils.distinctByKey(Student::getName)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
