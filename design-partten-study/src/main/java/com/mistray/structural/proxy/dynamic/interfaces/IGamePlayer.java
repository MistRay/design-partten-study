package com.mistray.structural.proxy.dynamic.interfaces;

/**
 * 游戏者接口
 */
public interface IGamePlayer {
    /**
     * 登陆游戏
     */
    void login(String user, String password);
    /**
     * 刷副本
     */
    void killBoss();
    /**
     * 升级
     */
    void upGrade();
    /**
     * 每个人都可以找自己的代理
     */
/*    IGamePlayer getProxy();*/
}
