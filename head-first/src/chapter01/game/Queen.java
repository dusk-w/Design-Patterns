package chapter01.game;

import chapter01.game.interf.SwordBehavior;

/**
 * 女王类
 *
 * @author wei
 * @since 2022-06-01-22-49
 */
public class Queen extends Character {

    public Queen() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    void fight() {
        weaponBehavior.useWeapon();
    }
}
