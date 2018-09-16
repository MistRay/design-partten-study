package com.mistray.structural.proxy.normal.bean;

import com.mistray.structural.proxy.normal.interfaces.IGamePlayer;

/**
 * @author MistLight
 * @create 2018-09-16
 * @desc 游戏者
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    /**
     * 构造方法传递名称
     */
    public GamePlayer(IGamePlayer iGamePlayer, String name) throws Exception {
        if (null == iGamePlayer) {
            throw new Exception("不能创建真实角色!");
        } else {
            this.name = name;
        }
    }

    /**
     * 登陆
     *
     * @param user     用户名
     * @param password 密码
     */
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登陆成功");
    }

    /**
     * 打怪
     */
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪!");
    }

    /**
     * 升级
     */
    @Override
    public void upGrade() {
        System.out.println(this.name + "又升了一级!");
    }
}
