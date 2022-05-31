package duck.interfac;

/**
 * 真的呱呱叫
 *
 * @author wei
 * @since 2022-05-31-23-41
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("真的呱呱叫");
    }
}
