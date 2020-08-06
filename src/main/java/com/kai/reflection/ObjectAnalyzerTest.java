package com.kai.reflection;
import java.util.ArrayList;

/**
 * @Auther: Kai Wang
 * @Date: 2020/07/08
 * @Description:
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));

    }
}
