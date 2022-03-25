public class Player {
    public String name;
    public int maxHP; // hp will never exceed this number. not bothering with temp hit points
    public int HP; // this hp will be affected by battle
    public int AC;
    public String dndClass;
    public String race;
    public int initMod;
    public String armor;
    public int potionsHeld = 3;
    public int potionHealing = 10;

    public Player(String name) {
        this.name = name;
    }

    public void setStats(int HP, int AC, String Class, String Race, int initMod){
        this.maxHP = HP;
        this.HP = HP;
        this.AC = AC;
        this.dndClass = Class;
        this.race = Race;
        this.initMod = initMod;
    }
}
