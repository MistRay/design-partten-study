package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 黑人男性人种
 */
public class MaleBlackHuman extends AbstractBlackHuman{
    /**
     * 而性别是不确定的,有男性和女性.
     */
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
