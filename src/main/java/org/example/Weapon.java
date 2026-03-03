package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    AXE(70, 0.8),
    BOW(40, 2.0);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}