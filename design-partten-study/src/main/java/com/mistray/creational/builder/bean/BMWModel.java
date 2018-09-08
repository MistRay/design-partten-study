package com.mistray.creational.builder.bean;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 宝马模型代码
 */
public class BMWModel extends CarModel{
    @Override
    public void start() {
        System.out.println("宝马车跑起来了");
    }

    @Override
    public void stop() {
        System.out.println("宝马车停下来了");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车鸣笛了");
    }

    @Override
    public void engineBoom() {
        System.out.println("宝马车引擎轰鸣");
    }
}
