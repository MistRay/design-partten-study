package com.mistray.creational.builder;

/**
 * @author MistLight
 * @create 2018-09-10
 * @desc 导演执行类
 * 建造者模式:
 * 定义: Separate the construction of a complex object from its representation so that the same
 * construction process can create different representations
 * (将一个复杂对象的构建和它的表示分离,使得同样的构建过程可以创建不同的表示.)
 * 优点:
 * 1.封装性
 * 2.独立,容易扩展
 * 3.便于控制细节风险
 *使用场景:
 * 1.相同的方法,不同的执行顺序,产生不同的事件结果时
 * 2.多个部件或零件,都可以装配到一个对象中,但是产生的结果又并不相同时
 * 3.产品类非诚复杂,或者产品类中的调用顺序不同产生了不同的效能.
 * 4.在对象创建过程中会使用到系统中的一些其他对象,这些对象在产品对象的创建过程中不易得到时,
 * 也可以使用建造者模式封装该对象的创建过程.(这本身已经是设计失误)
 *
 */
public class DirectorClient {
    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        System.out.println("=================================");
        director.getBBenzModel().run();
        System.out.println("=================================");
        director.getCBMWModel().run();
        System.out.println("=================================");
        director.getDBMWModel().run();
    }
}
