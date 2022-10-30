package lp.player;

import lp.weapon.Bow;
import lp.weapon.EvilStick;
import lp.weapon.Sword;
import lp.weapon.Weapon;

import java.util.ArrayList;

public class Player {
    private String name;
    private int gold;
    private int maxHp;
    private int hp;
    private final String cast;
    private final ArrayList<Weapon> inventory;

    public Player(String name, int gold, int maxHp, String cast) {
        this.name = name;
        this.gold = gold;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.cast = cast;
        this.inventory = new ArrayList<Weapon>();
        initInventory();
    }

    public void initInventory() {
        switch (cast) {
            case "Barbarian":
                inventory.add(new Sword());
                break;
            case "Wizard":
                inventory.add(new EvilStick());
                break;
            case "Archery":
                inventory.add(new Bow());
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                ", maxHp=" + maxHp +
                ", hp=" + hp +
                ", cast='" + cast + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
