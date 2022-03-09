public class Player {
    public String playerName;
    public int playerMaxHP; // hp will never exceed this number. not bothering with temp hit points
    public int playerHP; // this hp will be affected by battle
    public int playerAC;
    public String playerClass;
    public String playerRace;
    public int playerInitiativeMod;
    public String playerArmor;
    public int potionsHeld = 3;
    public int potionHealing = 10;

    public Player(String name) {
        this.playerName = name;
    }
}
