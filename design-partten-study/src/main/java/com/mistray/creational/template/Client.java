package com.mistray.creational.template;

import com.mistray.creational.template.bean.HummerH1Model;
import com.mistray.creational.template.bean.HummerH2Model;
import com.mistray.creational.template.bean.HummerModel;

/**
 * @author MistLight
 * @create 2018-09-07
 * @desc 场景类
 * 模板方法模式(Template Method Pattern)
 * 定义:
 * Define the skeleton in an operation ,deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure
 * (定义一个操作中的算法的框架,而将一些步骤延迟到子类中.使得子类可以不改变一个算法的结构即可冲定义该算法的某些特定步骤)
 * 基本方法:基本方法也叫做基本操作,是由子类实现的方法,并且在模板方法被调用.
 * 模板方法:可以有一个或几个,一般是一个具体方法,也就是一个框架,实现对基本方法的调度,完成固定的逻辑.
 * 注意: 为了防止恶意操作,一般模板方法都加上final关键字,不允许被复写.
 * 优点:
 * 封装不变部分,拓展可变部分.
 * 提取公共部分代码,便于维护
 * 行为由父类控制,子类实现
 * 缺点:
 * 抽象类负责声明最抽象,最普通的事物属性和方法,实现类完成具体的事物属性和方法.但模板方法模式却颠倒了,抽象类定义了部分抽象方法.
 * 由子类实现,子类的执行结果影响了父类的结果,也就是子类对父类产生影响,在复杂项目中,会带来代码阅读难度,对新手不友好
 */
public class Client {
    public static void main(String[] args) {
        HummerModel hummerH1Model = new HummerH1Model();
        HummerModel hummerH2Model = new HummerH2Model();
        hummerH1Model.run();
        hummerH2Model.run();
    }
}
