package com.mistray.creational.template.bean;

/**
 * @author MistLight
 * @create 2018-09-07
 * @desc H1型号悍马模型
 * 在我们的抽象类中isAlarm的返回值就是影响了模版方法的执行结果,该方法叫做钩子方法.
 */
public class HummerH1Model extends HummerModel {

    /**
     * 要响喇叭
     */
    private boolean alarmFlag = true;

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

    @Override
    public boolean isAlarm() {
        return alarmFlag;
    }

    /**
     * 要不要响喇叭,是由客户来决定的
     * 钩子方法:由子类的一个方法返回值决定公共部分的执行结果.
     * @param isAlarm
     */
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
