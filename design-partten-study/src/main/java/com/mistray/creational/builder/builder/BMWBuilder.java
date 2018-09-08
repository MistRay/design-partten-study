package com.mistray.creational.builder.builder;

import com.mistray.creational.builder.bean.BMWModel;
import com.mistray.creational.builder.bean.CarModel;

import java.util.ArrayList;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 宝马组装者->实际建造者
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}
