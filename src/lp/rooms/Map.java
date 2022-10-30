package lp.rooms;

import lp.Tuple;
import lp.player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Map {
    private static Room[][] rooms = new Room[4][4];
    private static Player player;
    private String cast;
    private static Tuple currentRoom;
    private boolean isGameOver;
    private String name;

    public Map() {
        isGameOver = false;
        currentRoom = new Tuple(0, 0);
        rooms[0][0] = new StartRoom();
    }

    public static void initCast(String cast, String name) {
        cast = cast;
        if(cast.equals("Barbarian")) {
            player = new Player(name, 150, 250, cast);
        } else if(cast.equals("Wizard")) {
            player = new Player(name, 250, 100, cast);
        } else {
            player = new Player(name, 200, 150, cast);
        }
    }

    public void gameOver() {
        isGameOver = true;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public static Room getCurrentRoom() {
        return rooms[currentRoom.i()][currentRoom.j()];
    }

    public void nextRoom(int i, int j) {
        currentRoom = currentRoom.moveTo(i, j);
    }

    public Player getPlayer() {
        return player;
    }

    public String displayMap() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = rooms.length - 1; i >= 0; i--) {
            stringBuilder.append("|");
            for(int j = 0; j < rooms.length; j++) {
                if(rooms[i][j] == null) {
                    stringBuilder.append("[     ]");
                } else if(rooms[i][j].equals(getCurrentRoom())) {
                    stringBuilder.append("[ you ]");
                } else {
                    stringBuilder.append("[     ]");
                }
            }
            stringBuilder.append("|\n");
        }
        return stringBuilder.toString();
    }
}