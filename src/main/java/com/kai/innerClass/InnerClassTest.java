package com.kai.innerClass;
/**
 * @Auther: Kai Wang
 * @Date: 2020/08/03
 * @Description:
 */
public class InnerClassTest {

    private int number = 100;

    public class Inner {
        private int number = 200;

        public void print() {
            int number = 400;
            System.out.println(number);//400
            System.out.println(this.number);//200
            System.out.println(InnerClassTest.this.number);//100
        }
    }

    public static void main(String[] args) {
        InnerClassTest innerClassTest = new InnerClassTest();
        InnerClassTest.Inner inner = innerClassTest.new Inner();
        inner.print();
    }

}
