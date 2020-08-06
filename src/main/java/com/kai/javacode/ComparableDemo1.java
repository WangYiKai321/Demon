package com.kai.javacode;
import java.util.Arrays;

/**
 * @Auther: Kai Wang
 * @Date: 2020/07/09
 * @Description:
 */
public class ComparableDemo1 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker",35000);
        staff[1] = new Employee("Carl Cracker",75000);
        staff[2] = new Employee("Tony Tester",38000);

        Arrays.sort(staff);

        for (Employee e:staff){
            System.out.println(e);
        }

    }
}
