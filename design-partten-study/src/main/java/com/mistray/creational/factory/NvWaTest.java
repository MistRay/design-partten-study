package com.mistray.creational.factory;

import com.mistray.creational.factory.bean.Human;
import com.mistray.creational.factory.plura.BlackHumanFactory;
import com.mistray.creational.factory.plura.WhiteHumanFactory;
import com.mistray.creational.factory.plura.YellowHumanFactory;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 女娲类
 */
public class NvWaTest {


    public static void main(String[] args) {
        // 创建一个黑种人工厂
        BlackHumanFactory blackHumanFactory = new BlackHumanFactory();
        // 创建一个白种人工厂
        WhiteHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        // 创建一个黄种人工厂
        YellowHumanFactory yellowHumanFactory = new YellowHumanFactory();
        Human black = blackHumanFactory.createHuman();
        black.getColor();
        black.talk();
        Human white = whiteHumanFactory.createHuman();
        white.getColor();
        white.talk();
        Human yellow = yellowHumanFactory.createHuman();
        yellow.getColor();
        yellow.talk();
    }
}
