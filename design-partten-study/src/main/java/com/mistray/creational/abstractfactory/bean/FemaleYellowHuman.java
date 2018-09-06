package com.mistray.creational.abstractfactory.bean;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 黄色女性人种
 */
public class FemaleYellowHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
