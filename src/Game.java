import java.util.Scanner;

public class Game {
    // "Character sheet"
    public static String playerName;
    public static int playerHP;
    public static int playerAC;
    public static String playerClass;
    public static String playerRace;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        characterSheet();
        System.out.println("Is this correct? [y/n]");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("n")) {
            playerName = null;
            characterSheet();
        }
        // create a game constructor that runs character creation for each new game and ask if info is correct. if yes continue with game, if incorrect, run a new game to start over the character creator
    }

    // fills out "character sheet" on first call, displays info on all other calls
    public static void characterSheet() {
        if (playerName == null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your adventurer:");
            System.out.println("1. Half-Orc Barbarian 2. Halfling Rogue 3. Human Wizard");
            String userChoice = sc.nextLine();
            if (userChoice.equals("1") || userChoice.equalsIgnoreCase("half-orc") || userChoice.equalsIgnoreCase("barbarian")) {
                playerHP = 14;
                playerAC = 13;
                playerClass = "Barbarian";
                playerRace = "Half-Orc";
            } else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("elf") || userChoice.equalsIgnoreCase("rogue")) {
                playerHP = 8;
                playerAC = 14;
                playerClass = "Rogue";
                playerRace = "Halfling";
            } else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("human") || userChoice.equalsIgnoreCase("wizard")) {
                playerHP = 8;
                playerAC = 12;
                playerClass = "Wizard";
                playerRace = "Human";
            } else {
                System.out.println("Invalid input, try again.");
                characterSheet();
            }
            System.out.println("Enter your adventurer's name:");
            playerName = sc.nextLine();
        }
        System.out.printf("Your name is %s, a %s %s.\nYour HP is %d and your AC is %d.\n", playerName, playerRace, playerClass, playerHP, playerAC);
    }
}
