package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 懒汉式 -> 双重检查 -> 优点：线程安全；延迟加载；效率较高。
 */
public class Singleton5 implements  Singleton{
    private static Singleton5 instance;

    private Singleton5() {
    }

    /**
     * 线程安全,且性能强
     * 在第一重检验通过后加锁创建实例,保证了多线程情况下,只会产生一个实例
     *
     * @return Singleton5
     */
    public static Singleton5 getInstance() {
        if (null == instance) {
            synchronized (Singleton5.class) {
                if (null == instance) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
