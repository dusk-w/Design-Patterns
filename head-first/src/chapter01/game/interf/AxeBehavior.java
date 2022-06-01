package chapter01.game.interf;

/**
 * 斧头攻击
 *
 * @author wei
 * @since 2022-06-01-22-46
 */
public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("用斧头攻击");
    }
}
