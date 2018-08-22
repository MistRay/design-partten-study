package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 懒汉式->线程安全->同步代码块
 */
public class Singleton4 {
    private static Singleton4 instance;

    /**
     * 私有构造
     */
    private Singleton4() {
    }

    /**
     * 线程安全,但效率低下,串行获取实例
     *
     * @return Singleton4
     */
    public static Singleton4 getInstance() {
        if (null == instance) {
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Singleton4 instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        Thread thread1 = new Thread(() -> {
            Singleton4 instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        Thread thread2 = new Thread(() -> {
            Singleton4 instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        Thread thread3 = new Thread(() -> {
            Singleton4 instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
