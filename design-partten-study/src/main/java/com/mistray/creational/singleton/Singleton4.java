package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 懒汉式->线程不安全->同步代码块
 */
public class Singleton4 implements Singleton {
    private static Singleton4 instance;

    /**
     * 私有构造
     */
    private Singleton4() {
    }

    /**
     * 线程不安全,这种同步并不能起到线程同步的作用。
     * 假如一个线程进入了if (singleton == null)判断语句块，
     * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
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


}
