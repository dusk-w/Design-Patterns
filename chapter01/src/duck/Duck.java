package duck;

import duck.interfac.FlyBehavior;
import duck.interfac.QuackBehavior;

/**
 * 以鸭子为例，鸭子共同的行为有游泳等，但飞，叫并不是所有鸭子都具有的行为，比如玩具鸭不会飞和叫
 *
 * @author wei
 * @since 2022-05-31-00-54
 */
public abstract class Duck {

    public Duck() {

    }

    /*
     * 鸭子现在会将飞行和呱呱叫的动作委托别人处理，而不是使用定义在Duck类内的飞行和呱呱叫方法
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("swimming...");
    }

    public void preformFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    /**
     * 动态设定行为
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
