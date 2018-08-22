package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 懒汉式->线程不安全
 */
public class Singleton1 implements  Singleton{
    private static Singleton1 singleton = null;

    /**
     * 私有构造
     */
    private Singleton1() {
    }

    /**
     * 通过该方法获得实例对象
     * 如果是多线程环境,会产生线程安全问题
     * 由于对象初始化是需要时间的,那么就会出现多个线程同时判断singleton == null的情况
     * 解决办法:添加sychronized关键字(但并不是最优解,因为串行执行会大大降低程序效率)
     */
    public static Singleton1 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }

}
