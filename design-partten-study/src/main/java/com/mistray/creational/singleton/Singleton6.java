package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 静态内部类 ->优点：避免了线程不安全，延迟加载，效率高。
 */
public class Singleton6 {

    private Singleton6 instance;

    /**
     * 使用静态内部类,根据静态内容在类加载时执行的特性
     * 让JVM进行控制,类加载是其他线程是无法进入的
     */
    private static class SingletonInstance {
        private static final Singleton6 SINGLETON_6 = new Singleton6();
    }

    private Singleton6() {
    }


    public static Singleton6 getInstance() {
        return SingletonInstance.SINGLETON_6;
    }
}
