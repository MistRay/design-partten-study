package com.mistray.creational.factory.bean;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 黑人
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("说话带rap");
    }
}
