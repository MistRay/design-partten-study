package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 测试类
 */
public class SingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Singleton instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        Thread thread1 = new Thread(() -> {
            Singleton instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        Thread thread2 = new Thread(() -> {
            Singleton instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        Thread thread3 = new Thread(() -> {
            Singleton instance = Singleton4.getInstance();
            System.out.println(instance);
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
