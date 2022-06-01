package chapter01.duck;

import chapter01.duck.interfac.FlyNoWay;
import chapter01.duck.interfac.Quack;

/**
 * 模型鸭
 *
 * @author wei
 * @since 2022-06-01-00-00
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("模型鸭");
    }
}
