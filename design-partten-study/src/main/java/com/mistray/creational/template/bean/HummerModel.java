package com.mistray.creational.template.bean;

/**
 * @author MistLight
 * @create 2018-09-07
 * @desc 抽象悍马模型
 */
public abstract class HummerModel {
    /**
     * 首先,这个模型要能够被发动起来
     */
    public abstract void start();

    /**
     * 能启动,也要能停下来
     */
    public abstract void stop();

    /**
     * 喇叭会发出声音
     */
    public abstract void alarm();

    /**
     * 引擎会轰隆隆的响
     */
    public abstract void engineBoom();

    /**
     * 应该能跑
     */
    public void run() {
        // 发动
        this.start();
        // 引擎轰鸣
        this.engineBoom();
        // 可以控制喇叭是否要响
        if (isAlarm()) {
            // 鸣笛
            this.alarm();
        }
        // 停止
        this.stop();
    }

    /**
     * 钩子方法,默认喇叭是会响的
     */
    public boolean isAlarm() {
        return true;
    }
}
