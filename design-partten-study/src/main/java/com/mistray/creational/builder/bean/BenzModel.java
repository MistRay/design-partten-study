package com.mistray.creational.builder.bean;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 奔驰模型代码
 */
public class BenzModel extends CarModel {
    @Override
    public void start() {
        System.out.println("奔驰车跑起来了");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停下来了");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车鸣笛了");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰车引擎轰鸣");
    }
}
