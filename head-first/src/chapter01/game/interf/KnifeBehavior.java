package chapter01.game.interf;

/**
 * 匕首攻击
 *
 * @author wei
 * @since 2022-06-01-22-45
 */
public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("用匕首刺杀");
    }
}
