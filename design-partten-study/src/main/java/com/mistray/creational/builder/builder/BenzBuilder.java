package com.mistray.creational.builder.builder;

import com.mistray.creational.builder.bean.BenzModel;
import com.mistray.creational.builder.bean.CarModel;

import java.util.ArrayList;

/**
 * @author MistLight
 * @create 2018-09-08
 * @desc 奔驰组装者
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
