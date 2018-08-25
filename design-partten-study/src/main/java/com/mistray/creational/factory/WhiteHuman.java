package com.mistray.creational.factory;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 白种人
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("一般说单字节");
    }
}
