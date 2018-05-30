package com.liuxn.mathx;

/**
 * Created by Administrator on 2018/5/29.
 */
public class MathTest {
    public static void main(String[] args) {
        long round = Math.round(11.5);
        System.out.println(round);//12
        long round1 = Math.round(-11.5);
        System.out.println(round1);//-11
        // round 是加1/2后求其floor
        short s1 = 1;
        s1+=1;
        System.out.println(s1);
        /**
         * 重写和重载是java多态性的不同的表现，
         * 重写是父类和子类之间的多态性的一种表现，
         * 重载是一个类中多态性的表现
         * 如果在子类中定义某种方法与其父类有相同的名称和参数，该方法就被重写了
         * 如果在同一个类中有多个同名的方法，他们有不同的返回值和参数，则这个方法被重载了，重载可以改变返回值和参数
         */

        /**
         * collection 是集合类的上级接口，主要继承它的子类有 set list
         * collections 是集合类的工具类，提供了一系列的静态方法实现对各种集合的搜索、排序、线程安全等
         */

        /**
         * set 里的元素是不能重复的，使用iterator()方法来区分是重复与否，equals()是判读两个set是否相等
         * equals 和 == 决定引用值是否指向同一个对象，equals在类中被覆盖，为的是当两个分离的对象的内容和类型相匹配的话，返回true
         */
    }
}
