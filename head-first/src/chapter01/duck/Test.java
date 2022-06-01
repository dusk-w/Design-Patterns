package chapter01.duck;

import chapter01.duck.interfac.FlyWithRocket;

/**
 * 测试
 *
 * @author wei
 * @since 2022-05-31-23-51
 */
public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.preformFly();
        mallardDuck.performQuack();

        System.out.println("-----------------------");

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.preformFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.preformFly();
    }
}
