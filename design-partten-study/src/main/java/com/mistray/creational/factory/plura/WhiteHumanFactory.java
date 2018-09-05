package com.mistray.creational.factory.plura;

import com.mistray.creational.factory.bean.Human;
import com.mistray.creational.factory.bean.WhiteHuman;

/**
 * @author MistLight
 * @create 2018-09-05
 * @desc 白色人种的创建工厂实现
 */
public class WhiteHumanFactory extends AbstractPluralHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
