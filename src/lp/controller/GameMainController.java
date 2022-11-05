package lp.controller;

import lp.rooms.Map;

public class GameMainController {
    public static void main(String[] args) {
        Map data = new Map();
        GameMainController.mainLoop(data);
    }

    private static void mainLoop(Map data) {
        while (!data.isGameOver()) {
            if(data.getCurrentRoom().roomEvent(0, data.getPlayer())) {
                System.out.println(data.getPlayer().toString());
                System.out.println(data.displayMap());
                Map.move();
                System.out.println(data.displayMap());
                System.out.println(data.getRoom());
                //data.gameOver();
            }
        }
    }
}
