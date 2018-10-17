package com.mistray.structural.proxy.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author MistLight
 * @create 2018-10-17
 * @desc 动态代理类
 */
public class GamePlayerIH implements InvocationHandler {
    /**
     * 被代理者
     */
    Class cls = null;
    /**
     * 被代理的实例
     */
    Object obj = null;

    /**
     * 要代理的对象
     *
     * @param obj
     */
    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强");
        Object invoke = method.invoke(this.obj, args);
        System.out.println("后置增强");
        return invoke;
    }
}
