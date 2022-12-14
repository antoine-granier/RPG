package lp.monster;

import lp.monster.action.*;

import java.util.ArrayList;

public class ActionBuilder {

    //similar to StratBuilder and other builders in this game
    //depending on a keyword, will fetch the appropriate class accordingly
    public static MonsterAction createAction(String name, int value) {
        switch (name) {
            case "damage":
                return new DamageAction(value);
            case "weak":
                return new WeakAction(value);
            case "strength":
                return new StrengthAction(value);
            case "block":
                return new BlockAction(value);
            case "ritual":
                return new RitualAction(value);
            case "split":
                return new SplitAction(value);
            default:
                throw new IllegalArgumentException("Action name is not recognized");
        }
    }

    //helper method to transform a string into multiple substrings
    public static ArrayList<String> stringsToArray(String string) {
        ArrayList<String> array = new ArrayList<String>();
        for (String word : string.split("#")) {
            array.add(word);
        }
        return array;
    }

    //helper method to transform a string (comprised of integers) into multiple substrings
    public static ArrayList<Integer> integersToArray(String string) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (String str : string.split("#")) {
            array.add(Integer.valueOf(str));
        }
        return array;
    }
}
