package com.mistray.structural.proxy.force.proxy;

import com.mistray.structural.proxy.force.interfaces.IGamePlayer;

/**
 * @author MistLight
 * @create 2018-09-16
 * @desc 代练者
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    /**
     * 通过构造函数传递要对谁代练
     *
     * @param iGamePlayer 被代理的对象
     */
    public GamePlayerProxy(IGamePlayer iGamePlayer) {
        this.gamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }

    /**
     * 代理的代理,没有,就自己
     *
     * @return IGamePlayer
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }

}
