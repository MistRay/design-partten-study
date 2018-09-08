package com.mistray.creational.builder;

import com.mistray.creational.builder.bean.CarModel;
import com.mistray.creational.builder.builder.BMWBuilder;
import com.mistray.creational.builder.builder.BenzBuilder;

import java.util.ArrayList;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 建造者模式场景类
 */
public class Client {
    public static void main(String[] args) {
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        // 1.先发动引擎
        sequence.add("engine boom");
        // 2.启动
        sequence.add("start");
        // 3.开了一会,停了
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);

        CarModel benz = benzBuilder.getCarModel();
        CarModel bmw = bmwBuilder.getCarModel();
        benz.run();
        bmw.run();

    }
}
