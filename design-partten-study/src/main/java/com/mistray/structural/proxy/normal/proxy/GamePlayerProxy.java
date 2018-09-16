package com.mistray.structural.proxy.normal.proxy;

import com.mistray.structural.proxy.normal.bean.GamePlayer;
import com.mistray.structural.proxy.normal.interfaces.IGamePlayer;

/**
 * @author MistLight
 * @create 2018-09-16
 * @desc 代练者
 */
public class GamePlayerProxy implements IGamePlayer{

    private  IGamePlayer gamePlayer = null;

    /**
     * 通过构造函数传递要对谁代练
     * @param name 名称
     */
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
    }
}
