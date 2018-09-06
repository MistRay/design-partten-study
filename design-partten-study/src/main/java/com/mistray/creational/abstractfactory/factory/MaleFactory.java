package com.mistray.creational.abstractfactory.factory;

import com.mistray.creational.abstractfactory.bean.Human;
import com.mistray.creational.abstractfactory.bean.MaleBlackHuman;
import com.mistray.creational.abstractfactory.bean.MaleWhiteHuman;
import com.mistray.creational.abstractfactory.bean.MaleYellowHuman;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 男性工厂
 */
public class MaleFactory implements  HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
