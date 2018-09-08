package com.mistray.creational.builder.builder;

import com.mistray.creational.builder.bean.CarModel;

import java.util.ArrayList;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 抽象汽车组装者--->抽象建造者
 */
public abstract class CarBuilder {
    // 建造一个模型,传入一个顺序
    public abstract void setSequence(ArrayList<String> sequence);

    // 设置顺序后,就可以直接拿到这个车辆的模型
    public abstract CarModel getCarModel();
}
