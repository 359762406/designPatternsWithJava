package com.itheima.pattern.adapter.object_adapter;


/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    /*
    * 注意：还有一个适配器模式是接口适配器模式。当不希望实现一个接口中所有的方法时，可以创建一个抽象类Adapter
    * 实现所有方法。而此时我们只需要继承该抽象类即可
    * */
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===============");
        //使用该电脑读取TF卡中的数据
        //创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
    /*
    * 应用场景
以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
    * */
}
