package com.mistray.creational.template.bean;

/**
 * @author MistLight
 * @create 2018-09-07
 * @desc H1型号悍马模型
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2发动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎轰鸣..轰隆隆");
    }

    /**
     * 默认是没有喇叭的
     * @return
     */
    @Override
    public boolean isAlarm() {
        return false;
    }
}
