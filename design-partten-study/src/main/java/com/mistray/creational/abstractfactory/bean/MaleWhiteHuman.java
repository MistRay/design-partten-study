package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 白人男性人种
 */
public class MaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白人男性人种");
    }
}
