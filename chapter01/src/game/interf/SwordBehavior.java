package game.interf;

/**
 * 用剑攻击
 *
 * @author wei
 * @since 2022-06-01-22-47
 */
public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("用剑砍");
    }
}
