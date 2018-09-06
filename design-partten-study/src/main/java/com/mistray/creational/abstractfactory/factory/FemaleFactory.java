package com.mistray.creational.abstractfactory.factory;

import com.mistray.creational.abstractfactory.bean.FemaleBlackHuman;
import com.mistray.creational.abstractfactory.bean.FemaleWhiteHuman;
import com.mistray.creational.abstractfactory.bean.FemaleYellowHuman;
import com.mistray.creational.abstractfactory.bean.Human;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 女性工厂
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
