package duck.interfac;

/**
 * 飞行行为实现
 * 实现所有不会飞的鸭子的动作
 *
 * @author wei
 * @since 2022-05-31-23-39
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞！！！");
    }
}
