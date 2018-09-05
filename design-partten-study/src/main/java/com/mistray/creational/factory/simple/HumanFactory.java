package com.mistray.creational.factory.simple;

import com.mistray.creational.factory.bean.BlackHuman;
import com.mistray.creational.factory.bean.Human;
import com.mistray.creational.factory.bean.WhiteHuman;
import com.mistray.creational.factory.bean.YellowHuman;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 人类工厂(简单工厂) ->通过new对象的方式创建实例
 * 工厂方法模式的优点
 * 首先,具有良好的封装性,代码结构清晰,一个对象创建是有条件约束的,如果一个调用者需要一个具体的产品对象
 * ,只要知道这个产品的类名(或者约束字符串)就可以了,不用知道创建对象的艰辛过程,减低模块间的耦合
 */
public class HumanFactory {
    public static final int BLACK_HUMAN = 1;
    public static final int YELLOW_HUMAN = 2;
    public static final int WHITE_HUMAN = 3;

    /**
     * 根据类型创建不同的对象
     *
     * @param type 类型
     * @return Human
     */
    public static Human createHuman(int type) {
        switch (type) {
            case 1:
                return new BlackHuman();
            case 2:
                return new YellowHuman();
            case 3:
                return new WhiteHuman();
            default:
                return null;
        }
    }
}
