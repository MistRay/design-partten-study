package com.mistray.creational.factory;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 人类工厂(简单工厂)-->反射创建实例
 */
public class HumanFactoryReflection {
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人类生成错误");
            e.printStackTrace();
        }
        return (T) human;
    }
}
