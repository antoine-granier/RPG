package lp.rooms;

import lp.player.Player;

import java.io.IOException;

public class TrapRoom implements Room{
    @Override
    public boolean roomEvent(int index, Player player) throws IOException {
        player.takeDamage(20);
        return true;
    }
}
