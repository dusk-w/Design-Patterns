package chapter01.game;

import chapter01.game.interf.AxeBehavior;
import chapter01.game.interf.KnifeBehavior;

/**
 * 测试类
 *
 * @author wei
 * @since 2022-06-01-22-53
 */
public class Test {

    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();

        Queen queen = new Queen();
        queen.fight();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();
    }
}
