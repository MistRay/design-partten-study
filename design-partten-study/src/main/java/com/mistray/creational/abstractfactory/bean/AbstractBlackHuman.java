package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 黑人 ->相当于一个抽象产品
 */
public abstract class AbstractBlackHuman implements Human {
    /**
     * 下面两个方法是该产品族下的产品共有的
     */
    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("说话带rap");
    }
}
