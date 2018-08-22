package com.mistray.creational.singleton;

/**
 * @author MistLight
 * @create 2018-08-22
 * @desc 臣子类
 */
public class Minister {
    public static void main(String[] args) {
        // 连续三天见的是同一个皇帝
        for (int i = 0; i < 3; i++) {
            Emperor emperor = Emperor.getInstatnce();
            emperor.say();
        }
    }
}
