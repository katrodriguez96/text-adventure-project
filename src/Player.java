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

    public void setStats(int HP, int AC, String Class, String Race, int initMod){
        this.playerMaxHP = HP;
        this.playerHP = HP;
        this.playerAC = AC;
        this.playerClass = Class;
        this.playerRace = Race;
        this.playerInitiativeMod = initMod;
    }
}
