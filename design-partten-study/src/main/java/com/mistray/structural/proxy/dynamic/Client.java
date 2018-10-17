package com.mistray.structural.proxy.dynamic;

import com.mistray.structural.proxy.dynamic.bean.GamePlayer;
import com.mistray.structural.proxy.dynamic.interfaces.IGamePlayer;
import com.mistray.structural.proxy.dynamic.proxy.GamePlayerIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author MistLight
 * @create 2018-10-17
 * @desc 动态代理场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(player);
        ClassLoader classLoader = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangSan","password");
        proxy.killBoss();
        proxy.upGrade();
        System.out.println("结束时间是2018年10月17日");
    }
}
