package com.kai.designPattern.TemplateMethod.demo3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: Kai Wang
 * @Date: 2020/11/24
 * @Description:
 */
public class CaffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getCustomerInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getCustomerInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
