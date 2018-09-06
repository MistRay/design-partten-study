package com.mistray.creational.abstractfactory;

import com.mistray.creational.abstractfactory.bean.Human;
import com.mistray.creational.abstractfactory.factory.FemaleFactory;
import com.mistray.creational.abstractfactory.factory.HumanFactory;
import com.mistray.creational.abstractfactory.factory.MaleFactory;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 女娲测试类
 * 抽象
 */
public class NvWaTest {
    public static void main(String[] args) {
        // 创建一个男性工厂
        HumanFactory maleFactory = new MaleFactory();
        // 创建一个女性工厂
        HumanFactory femaleFactory = new FemaleFactory();
        Human blackHuman = maleFactory.createBlackHuman();
        Human whiteHuman = femaleFactory.createWhiteHuman();
        blackHuman.getColor();
        blackHuman.getSex();
        blackHuman.talk();
        whiteHuman.getColor();
        whiteHuman.getSex();
        whiteHuman.talk();
    }
}
