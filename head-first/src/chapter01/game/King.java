package chapter01.game;

import chapter01.game.interf.SwordBehavior;

/**
 * 国王类
 *
 * @author wei
 * @since 2022-06-01-22-52
 */
public class King extends Character{

    public King() {
        weaponBehavior = new SwordBehavior();
    }
    @Override
    void fight() {
        weaponBehavior.useWeapon();
    }
}
