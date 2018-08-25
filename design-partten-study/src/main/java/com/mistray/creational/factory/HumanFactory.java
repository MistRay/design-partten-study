package com.mistray.creational.factory;

/**
 * @author MistLight
 * @create 2018-08-23
 * @desc 人类工厂(简单工厂) ->通过new对象的方式创建实例
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
                return new YelloHuman();
            case 3:
                return new WhiteHuman();
            default:
                return null;
        }
    }
}
