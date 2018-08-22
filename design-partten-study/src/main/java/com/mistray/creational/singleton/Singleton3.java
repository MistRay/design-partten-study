package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 懒汉式->线程安全(使用)->效率低
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    /**
     * 由于获取实例的方法由synchronized关键字修饰
     * 所以是线程安全的 -> 但由于加锁的缘故,
     * @return Singleton3
     */
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
