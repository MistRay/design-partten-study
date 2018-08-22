package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 饿汉式->静态代码块->线程安全
 */
public class Singleton2 implements  Singleton{
    /**
     * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
     * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
     */
    private static Singleton2 instance;

    // 静态代码块在类加载是就会执行
    static {
        instance = new Singleton2();
    }


    /**
     * 由于静态代码块在类加载时执行,类只会被加载一次,所以不会产生线程安全问题
     *
     * @return Singleton2
     */
    private Singleton2 getInstance(){
        return instance;
    }



}
