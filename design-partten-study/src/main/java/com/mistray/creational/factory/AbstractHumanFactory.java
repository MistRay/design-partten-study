package com.mistray.creational.factory;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 抽象人类工厂
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
