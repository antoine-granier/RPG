package lp.weapon;

public class Axe extends AbstractWeapon {
    private static int DAMAGE = 20;

    public Axe() {
        super(DAMAGE, Rarity.RARE);
    }

    @Override
    public String asciiArt() {
        return "  ,  /\\  .  \n" +
                " //`-||-'\\\\ \n" +
                "(| -=||=- |)\n" +
                " \\\\,-||-.// \n" +
                "  `  ||  '  \n" +
                "     ||     \n" +
                "     ||     \n" +
                "     ||     \n" +
                "     ||     \n" +
                "     ||     \n" +
                "     ()";
    }
}
