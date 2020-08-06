package com.kai.spring.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @Author: Kai Wang
 * @Date: 03/25/20 14:03
 */
@Test
public class AopTest {

    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Arithmetic arithmetic = (Arithmetic) context.getBean("arithmetic");
        int result = arithmetic.add(1, 2);
        System.out.println("result: "+result);

        System.out.println("--------------");

        result = arithmetic.div(8, 1);
        System.out.println("result: "+result);
    }
}
