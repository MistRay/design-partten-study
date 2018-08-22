package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 饿汉式->静态代码块->线程安全
 */
public class Singleton2 {
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
