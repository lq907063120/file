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

        /**
         * error 是表示恢复不是不可能但很困难的情况的一种严重问题。比如“内存溢出，不可能指望程序能处理的情况
         * exception 表示一种设计或实现问题，表示如果程序运行正常，就不会发生这样的情况
         */
        /**
         * java面向对象的主要特征
         * 抽象、继承、封装、多态
         */

        /**
         *
         * mybatis（核心sqlSessionFactory）
         * 是支持定制化sql 存储过程以及高级映射的持久层框架，避免了jdbc代码以及手工设置参数
         * mybatis 使用xml或者注解配置和映射本体，将java的pojos映射成数据库中的记录
         *
         * 优点：
         * 1、实现类接口的绑定，使用更加方便。（dao层接口与xml映射文件的绑定，自动生成接口实现）
         * 2、对象关系映射改变，效率更高（一对一、一对多）
         * 3、采用了功能强大的基于OGNL的表达式消除其他元素
         *
         * 原理：
         *      程序根基xml配置文件创建sqlSessionFactory,sqlSessionFactory根据配置
         *      获取一个sqlSession，sqlSession包含了执行sql的所有方法，可以通过SQLSessionFactory
         *      实例直接运行sql语句完成对数据的增删改查和事务的提交，最后关闭sqlsession
         *
         */
    }
}
