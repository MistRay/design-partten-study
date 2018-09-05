package com.mistray.creational.factory.plura;

import com.mistray.creational.factory.bean.Human;
import com.mistray.creational.factory.bean.YellowHuman;

/**
 * @author MistLight
 * @create 2018-09-05
 * @desc 黄色人种的创建工厂实现
 */
public class YellowHumanFactory extends AbstractPluralHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
