package com.mistray.creational.template.bean;

/**
 * @author MistLight
 * @create 2018-09-07
 * @desc H1型号悍马模型
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H1发动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎轰鸣..轰隆隆");
    }

}
