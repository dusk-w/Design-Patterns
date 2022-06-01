package chapter01.duck.interfac;

/**
 * 飞行行为实现
 * 实现所有有翅膀飞行的鸭子飞行动作
 *
 * @author wei
 * @since 2022-05-31-23-39
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }
}
