package com.itheima.pattern.decorator;

/**
 * @version v1.0
 * @ClassName: Garnish
 * @Description: 装饰者类(抽象装饰者角色)
 * @Author: 黑马程序员
 */
//Decorator 继承FastFood 又聚合了FastFood
public abstract class Garnish extends FastFood {

    //声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
    /*
    * 代理和装饰者的区别
静态代理和装饰者模式的区别：

相同点：
    都要实现与目标类相同的业务接口
    在两个类中都要声明目标对象
    都可以在不修改目标类的前提下增强目标方法
*
不同点：
    >目的不同
    装饰者是为了增强目标对象
    静态代理是为了保护和隐藏目标对象
    *
    >获取目标对象构建的地方不同
    装饰者是由外界传递进来，可以通过构造方法传递
    静态代理是在代理类内部创建，以此来隐藏目标对象
    * */
}
