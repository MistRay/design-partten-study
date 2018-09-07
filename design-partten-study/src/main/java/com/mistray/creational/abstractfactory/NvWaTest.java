package com.mistray.creational.abstractfactory;

import com.mistray.creational.abstractfactory.bean.Human;
import com.mistray.creational.abstractfactory.factory.FemaleFactory;
import com.mistray.creational.abstractfactory.factory.HumanFactory;
import com.mistray.creational.abstractfactory.factory.MaleFactory;

/**
 * @author MistLight
 * @create 2018-09-06
 * @desc 女娲测试类->抽象工厂测试类
 * 定义:
 * provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 * 为创建一组相关或相互依赖的对象提供一个接口,而且无需指定它们的具体类.
 * 优点:
 * 封装性,每个产品的实现类不是高层模块要关心的,它要关心什么?接口,是抽象,它不关心对象是如何创建出来,这由谁负责呢?
 * 工厂类,只要知道工厂类是谁,我就能创建一个需要的对象.
 * 产品族内的约束为非公开状态.具体产品族内的约束是在工厂内实现的.
 * 缺点:
 * 抽象工厂的最大缺点是产品族的扩展非常困难.
 * 但是产品族扩展困难,并不是产品等级.
 */
public class NvWaTest {
    public static void main(String[] args) {
        // 创建一个男性工厂->所有男性对应一个产品族
        // 所以就有了组装该产品族的具体工厂,即女性工厂
        HumanFactory maleFactory = new MaleFactory();
        // 创建一个女性工厂->所有女性对应一个产品族
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
