package com.mistray.creational.abstractfactory.factory;

import com.mistray.creational.abstractfactory.bean.Human;

/**
 * 人类抽象工厂
 */
public interface HumanFactory {
    /**
     * 创建一个黄色人种
     * @return human
     */
    Human createYellowHuman();

    /**
     * 创建一个白色人种
     * @return human
     */
    Human createWhiteHuman();

    /**
     * 创建一个黑色人种
     * @return human
     */
    Human createBlackHuman();

}
