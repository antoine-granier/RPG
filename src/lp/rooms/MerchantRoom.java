package lp.rooms;

import lp.player.Player;
import lp.weapon.Weapon;

import java.util.ArrayList;

public class MerchantRoom implements Room {

    private ArrayList<Weapon> shop;
    private boolean loaded;

    public MerchantRoom() {
        this.shop = new ArrayList<Weapon>();
        this.loaded = false;
    }

    @Override
    public boolean roomEvent(int index, Player player) {
        if(!loaded) {

        } else {

        }
        return false;
    }
}
