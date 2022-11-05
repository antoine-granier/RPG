package lp.controller;

import lp.rooms.Map;

import java.io.IOException;

public class GameMainController {
    public static void main(String[] args) throws IOException {
        Map data = new Map();
        GameMainController.mainLoop(data);
    }

    private static void mainLoop(Map data) throws IOException {
        while (!data.isGameOver()) {
            if(data.getCurrentRoom().roomEvent(0, data.getPlayer())) {
                System.out.println(data.getPlayer().toString());
                System.out.println(data.displayMap());
                Map.move();
                System.out.println(data.displayMap());
                System.out.println(data.getRoom());
                if(data.getPlayer().isDead()) {
                    data.gameOver();
                }
            }
        }
    }
}
