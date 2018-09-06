package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 白种人->相当于一个抽象产品
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("一般说单字节");
    }
}
