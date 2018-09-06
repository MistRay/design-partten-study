package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 黄种人->相当于一个抽象产品
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("一般都说双字节");
    }
}
