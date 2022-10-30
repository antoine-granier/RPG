package lp.weapon;

public abstract class AbstractWeapon implements Weapon {

    private int damage;
    private final Rarity rarity;

    public AbstractWeapon(int damage, Rarity rarity) {
        this.damage = damage;
        this.rarity = rarity;
    }

    @Override
    public int makeDamage() {
        return damage;
    }

    @Override
    public abstract String asciiArt();
}
