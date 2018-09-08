package com.mistray.creational.builder.bean;

import java.util.ArrayList;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 车辆模型的抽象类
 */
public abstract class CarModel {
    // 各个基本方法的执行顺序
    private ArrayList<String> sequence = new ArrayList<>();

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

    // 要会跑,而且要根据规定的顺序跑
    public final void run() {
        // 循环基本方法的执行顺序,按照顺序执行
        for (String actionName : sequence) {
            if ("start".equals(actionName)) {
                this.start();
            } else if ("stop".equals(actionName)) {
                this.stop();
            } else if ("alarm".equals(actionName)) {
                this.alarm();
            } else if ("engine boom".equals(actionName)) {
                this.engineBoom();
            }
        }
    }

    /**
     * 把循序传入类中
     *
     * @param sequence
     */
    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
