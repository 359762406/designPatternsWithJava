package com.itheima.pattern.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    /*
    执行流程如下：
1.在测试类中通过代理对象调用sell()方法
2.根据多态的特性，执行的是代理类（$Proxy0）中的sell()方法
3.代理类（$Proxy0）中的sell()方法中又调用了InvocationHandler(h)接口的子实现类对象的invoke方法
    m3 = Class.forName("com.itheima.pattern.proxy.jdk_proxy.SellTickets").getMethod("sell", new Class[0]);
    public final void sell() {
        this.h.invoke(this, m3, null);
        return;
    }
4.invoke方法通过反射执行了真实对象所属类(TrainStation)中的sell()方法
    * */
    public static void main(String[] args) {
        //获取代理对象
        //1,创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2,使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //3,调用卖调用的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        //让程序一直执行
        while(true) {}

    }
}
