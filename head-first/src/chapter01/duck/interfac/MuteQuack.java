package chapter01.duck.interfac;

/**
 * 名为呱呱叫，实为不出声
 *
 * @author wei
 * @since 2022-05-31-23-43
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("。。。。。。");
    }
}
