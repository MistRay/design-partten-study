package com.mistray.creational.factory.plura;

import com.mistray.creational.factory.bean.Human;

/**
 * @author MistLight
 * @create 2018-09-05
 * @desc 复数工厂实现
 */
public abstract class AbstractPluralHumanFactory {
    public abstract Human createHuman();
}
