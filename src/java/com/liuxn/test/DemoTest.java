package com.liuxn.test;

/**
 * Created by Administrator on 2018/6/4.
 */
public class DemoTest {

    public static void main(String[] args) {
        TestDomo testDomo = new TestDomo();
        int i = testDomo.addCount();
        System.out.println(i);//1

        TestDomo t1 = new TestDomo();
        int i1 = t1.addCount();
        System.out.println(i1);//2
        int i2 = t1.addCount();
        System.out.println(i2);//3
        /***
         *
         * static 修饰的变量为静态变量
         */

    }
}
