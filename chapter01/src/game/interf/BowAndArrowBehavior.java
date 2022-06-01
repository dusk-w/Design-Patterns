package game.interf;

/**
 * 弓箭射击
 *
 * @author wei
 * @since 2022-06-01-22-45
 */
public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("用弓箭射击");
    }
}
