package chapter01.duck;

import chapter01.duck.interfac.FlyNoWay;
import chapter01.duck.interfac.Quack;

/**
 * 绿头鸭实现鸭子类
 *
 * @author wei
 * @since 2022-05-31-23-49
 */
public class MallardDuck extends Duck{

    /**
     * 这里仍然是对具体实现编程，后续修正
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("绿头鸭");
    }
}
