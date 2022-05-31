package duck.interfac;

/**
 * 名为呱呱叫，实为吱吱叫
 *
 * @author wei
 * @since 2022-05-31-23-42
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
