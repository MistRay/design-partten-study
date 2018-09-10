package com.mistray.creational.builder;

import com.mistray.creational.builder.bean.BMWModel;
import com.mistray.creational.builder.bean.BenzModel;
import com.mistray.creational.builder.builder.BMWBuilder;
import com.mistray.creational.builder.builder.BenzBuilder;

import java.util.ArrayList;

/**
 * @author MistLight
 * @create 2018-09-10
 * @desc 导演类
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A型号奔驰->先start,后stop,引擎,喇叭都不存在的
     *
     * @return
     */
    public BenzModel getABenzModel() {
        // 清理场景
        this.sequence.clear();
        // ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B型号奔驰->先发动引擎->启动->停止->没有喇叭
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    /**
     * C型号宝马->按喇叭->启动->停止
     */
    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
    /**
     * D类型的宝马车只有一个功能,就是跑
     */
    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return  (BMWModel) this.bmwBuilder.getCarModel();
    }

}
