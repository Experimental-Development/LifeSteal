package me.experimental.utils;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;

/*
 * LICENSE NOTICE
 *
 * If you are to have stumbled upon this file and are reading this,
 * this is the License for all code in this file:
 *
 * THIS MESSAGE WILL NOT BE REMOVED. EVEN IN FORKS. THIS MESSAGE MUST STAY
 * I WILL FIND YOU IF YOU REMOVE IT
 *
 * LICENSE:
 *
 * All code is editable by the user (you), and requestable by ExperimentalX
 * at any time. If requested, I (ExperimentalX) am allowed to view modified code.
 * You can do whatever the heck you want to, as long as this message remains
 * and the command "/experimental" stays. If it is removed, I can revoke your
 * access to this code and all forks you have.
 */

public class HealthSystem {


    private HealthSystem() {

    }

    public static void set(double amount, LivingEntity entity) {
        entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(amount);
    }

    public static double get(LivingEntity entity) {
        return entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
    }

    public static boolean setIfWithin(double amount, double min, double max, LivingEntity entity) {
        if(amount > min && amount <= max) {
            set(amount, entity);
            return true;
        }
        return false;
    }

    public static void increase(double amount, LivingEntity entity) {
        set(get(entity) + amount, entity);
    }

    public static void decrease(double amount, LivingEntity entity) {
        set(get(entity) - amount, entity);
    }

    public static boolean increaseIfUnder(double amount, double max, LivingEntity entity) {
        return setIfWithin(get(entity) + amount, 0, max, entity);
    }

    public static boolean decreaseIfOver(double amount, double min, LivingEntity entity) {
        return setIfWithin(get(entity) - amount, min, 2048, entity);
    }

}