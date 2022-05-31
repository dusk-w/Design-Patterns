package duck.interfac;

/**
 * 飞行行为实现
 * 实现所有有火箭飞行的鸭子飞行动作
 *
 * @author wei
 * @since 2022-06-01-00-00
 */
public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("火箭加速器");
    }
}
