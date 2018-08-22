package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 皇帝类
 */
public class Emperor {
    // 初始化皇帝类
    private static final Emperor EMPEROR = new Emperor();

    // 私有构造方法,一个国家只有一个皇帝
    private Emperor() {
    }

    public static Emperor getInstatnce() {
        return EMPEROR;
    }

    /**
     * 调用皇帝特有方法
     */
    public  void say() {
        System.out.println("在下是皇帝X");
    }
}
