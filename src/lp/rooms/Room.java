package lp.rooms;

import lp.player.Player;

public interface Room {
    /**
     *
     * @param index use an index to know the choice player
     * @param player
     * @return
     */
    public boolean roomEvent(int index, Player player);
}
