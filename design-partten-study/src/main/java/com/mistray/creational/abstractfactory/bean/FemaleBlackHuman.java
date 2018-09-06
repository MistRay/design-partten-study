package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 黑人女性人种
 */
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
