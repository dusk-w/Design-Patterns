package chapter01.game;

import chapter01.game.interf.WeaponBehavior;

/**
 * 人物类
 *
 * @author wei
 * @since 2022-06-01-22-48
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
