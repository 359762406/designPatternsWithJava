package com.itheima.pattern.proxy.cglib_proxy;


import jdk.jfr.Description;
/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
/*
* 如果没有定义SellTickets接口，只定义了TrainStation(火车站类)。
* 很显然JDK代理是无法使用了，因为JDK动态代理要求必须定义接口，对接口进行代理。

CGLIB是一个功能强大，高性能的代码生成包。
* 它为没有实现接口的类提供代理，为JDK的动态代理提供了很好的补充。
* */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
