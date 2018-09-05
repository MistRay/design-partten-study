package com.mistray.creational.factory.plura;

import com.mistray.creational.factory.bean.BlackHuman;
import com.mistray.creational.factory.bean.Human;

/**
 * @author MistLight
 * @create 2018-09-05
 * @desc 黑色人种的创建工厂实现
 */
public class BlackHumanFactory extends AbstractPluralHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
