package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 懒汉式 -> 双重检查 -> 优点：线程安全；延迟加载；效率较高。
 */
public class Singleton5 implements  Singleton{
    /**
     * 关于为什么要加volatile
     *
     * 由于instance = new Singleton5(); 并不是一个原子操作
     * 你在其他线程中使用了这个static instance的静态变量，
     * 用instance==null的方法判断instance有没有被正确初始化的话，
     * 有可能会出现instance访问失败的情况。在这个时间点上，同步代码块尚未执行完毕，
     * 由于指令重排序，instance对象已经指向分配的内存空间，但是instance尚未初始化完毕。
     * 在这时调用instance，会引发jvm的exception。
     */
    private static volatile Singleton5 instance;

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
