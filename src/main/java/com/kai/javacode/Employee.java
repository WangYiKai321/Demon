package com.kai.javacode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Auther: Kai Wang
 * @Date: 2020/07/09
 * @Description:
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private double salary;

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
