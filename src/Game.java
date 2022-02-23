import java.util.Scanner;

public class Game {
    // "Character sheet"
    public static String playerName;
    public static int playerMaxHP; // hp will never exceed this number. not bothering with temp hit points
    public static int playerHP; // this hp will be affected by battle
    public static int playerAC;
    public static String playerClass;
    public static String playerRace;

    // Game constructor
    public Game () {
        Scanner sc = new Scanner(System.in);
        characterSheet();
        System.out.println("\nIs this correct? [y/n]"); // confirm character chosen
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) { // runs new game to restart character creation
            playerName = null;
            Game newGame = new Game();
        }
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t#############################");
        System.out.println("\t\t\t# WELCOME TO THE ADVENTURE! #");
        System.out.println("\t\t\t#############################");
        Game newGame = new Game();
    }

    // fills out "character sheet" on first call, displays info on all other calls
    public static void characterSheet() {
        if (playerName == null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nChoose your adventurer:");
            System.out.println("1. Half-Orc Barbarian 2. Halfling Rogue 3. Human Wizard");
            String userChoice = sc.nextLine();
            if (userChoice.equals("1") || userChoice.equalsIgnoreCase("half-orc") || userChoice.equalsIgnoreCase("barbarian")) {
                playerMaxHP = 14;
                playerHP = playerMaxHP;
                playerAC = 13;
                playerClass = "Barbarian";
                playerRace = "Half-Orc";
            } else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("halfling") || userChoice.equalsIgnoreCase("rogue")) {
                playerMaxHP = 8;
                playerHP = playerMaxHP;
                playerAC = 14;
                playerClass = "Rogue";
                playerRace = "Halfling";
            } else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("human") || userChoice.equalsIgnoreCase("wizard")) {
                playerMaxHP = 8;
                playerHP = playerMaxHP;
                playerAC = 12;
                playerClass = "Wizard";
                playerRace = "Human";
            } else {
                System.out.println("\nInvalid input, try again.");
                characterSheet();
            }
            System.out.println("\nEnter your adventurer's name:");
            playerName = sc.nextLine();
        }
        System.out.printf("\nYour name is %s, a %s %s.\nYour max HP is %d and your AC is %d.\n", playerName, playerRace, playerClass, playerHP, playerAC);
    }
}
