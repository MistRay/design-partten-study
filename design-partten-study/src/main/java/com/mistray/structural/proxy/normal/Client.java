package com.mistray.structural.proxy.normal;

import com.mistray.structural.proxy.normal.interfaces.IGamePlayer;
import com.mistray.structural.proxy.normal.proxy.GamePlayerProxy;

/**
 * @author MistLight
 * @create 2018-09-16
 * @desc 场景类
 *
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个代练
        IGamePlayer proxy = new GamePlayerProxy("老王");
        // 打开游戏,记下时间戳
        System.out.println("开始时间是:2018-08-25 10:45");
        proxy.login("laowang","123456");
        // 打怪
        proxy.killBoss();
        // 升级
        proxy.upGrade();
        // 记录游戏时间
        System.out.println("结束时间是:2018-8-26 03:40");
    }
}
