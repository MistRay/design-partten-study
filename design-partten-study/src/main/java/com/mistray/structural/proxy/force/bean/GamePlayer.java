package com.mistray.structural.proxy.force.bean;

import com.mistray.structural.proxy.force.interfaces.IGamePlayer;
import com.mistray.structural.proxy.force.proxy.GamePlayerProxy;

/**
 * @author MistLight
 * @create 2018-09-16
 * @desc 强制代理的真实角色
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    /**
     * 找到自己的代理
     */
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 构造方法传递名称
     */
    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 登陆
     *
     * @param user     用户名
     * @param password 密码
     */
    @Override
    public void login(String user, String password) {
        if (isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登陆成功");
        } else {
            System.out.println("请使用指定的代理访问!");
        }
    }

    /**
     * 打怪
     */
    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println(this.name + "在打怪!");
        } else {
            System.out.println("请使用指定的代理访问!");
        }
    }

    /**
     * 升级
     */
    @Override
    public void upGrade() {
        if (isProxy()) {
            System.out.println(this.name + "又升了一级!");
        } else {
            System.out.println("请使用指定的代理访问!");
        }
    }

    /**
     * 校验是否使用代理访问
     */
    private boolean isProxy() {
        if (null == this.proxy) {
            return false;
        } else {
            return true;
        }
    }
}
