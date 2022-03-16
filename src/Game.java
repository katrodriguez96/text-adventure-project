import java.util.Scanner;

public class Game {
    public static Scanner sc = new Scanner(System.in);
    public static Player user;

    public static void newGame() {
        characterSheet();
        boolean userContinue = false;
        do {
            System.out.println("\nIs this correct? [y/n]"); // confirm character chosen
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
                userContinue = true;
            } else if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
                user = null;
                newGame();
            } else {
                System.out.println("\nInvalid input, try again.");
            }
        } while (!userContinue);
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t#############################");
        System.out.println("\t\t\t# WELCOME TO THE ADVENTURE! #");
        System.out.println("\t\t\t#############################");
        newGame();
        startAdventure();
    }

    // fills out "character sheet" on first call, displays info on all other calls
    public static void characterSheet() {
        do {
            System.out.println("\nChoose your adventurer:");
            System.out.println("1. Half-Orc Barbarian 2. Halfling Rogue 3. Human Wizard");
            String userChoice = sc.nextLine();
            if (userChoice.equals("1") || userChoice.equalsIgnoreCase("half-orc") || userChoice.equalsIgnoreCase("barbarian")) {
                System.out.println("\nEnter your adventurer's name:");
                String inputName = sc.nextLine();
                user = new Player(inputName);
                user.setStats(14, 13, "Barbarian", "Half-Orc", 1);
            } else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("halfling") || userChoice.equalsIgnoreCase("rogue")) {
                System.out.println("\nEnter your adventurer's name:");
                String inputName = sc.nextLine();
                user = new Player(inputName);
                user.setStats(8, 14, "Rogue", "Halfling", 3);
                user.playerArmor = "leather armor";
            } else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("human") || userChoice.equalsIgnoreCase("wizard")) {
                System.out.println("\nEnter your adventurer's name:");
                String inputName = sc.nextLine();
                user = new Player(inputName);
                user.setStats(8, 12, "Wizard", "Human", 2);
            } else {
                System.out.println("\nInvalid input, try again.");
            }
        } while (user == null);
        System.out.printf("\nYour name is %s, a %s %s.\nYour max HP is %d and your AC is %d.\n", user.playerName, user.playerRace, user.playerClass, user.playerHP, user.playerAC);
    }

    public static void startAdventure() {
        System.out.println("\nIt was midday when you left your hometown for the first time, sunshine bleeding through the trees that lined the well worn road stretching ahead of you.\nYou turn one last time to take in the familiar sight of the town gate. It was a fine enough home, but you knew that one day you'd leave to seek...");
        System.out.println("1. Adventure 2. Riches 3. Knowledge");
        String userAmbition = sc.nextLine();
        if (userAmbition.equals("1") || userAmbition.equalsIgnoreCase("adventure")){
            System.out.println("\nYou yearned for the thrill of adventure, of discovering new sights, fighting powerful foes, maybe making a few friends and at least a dozen enemies along the way.");
        } else if (userAmbition.equals("2") || userAmbition.equalsIgnoreCase("riches")){
            System.out.println("\nYour heart hammered in your chest at the thought of forgotten treasures just waiting for you in some dusty tomb somewhere, of pouches of gold earned from bounties,\nand most of all, spending said riches on fine food, wine, and other luxuries.");
        } else if (userAmbition.equals("3") || userAmbition.equalsIgnoreCase("knowledge")){
            System.out.println("\nYour mind raced thinking of all that you could learn from the greatest libraries and academies in the realm, of discovering forgotten knowledge in some dusty tome\nsomewhere, and putting said knowledge to use in bettering your skills and those around you.");
        } else {
            System.out.println("\nInput invalid, try again.");
            startAdventure();
        }
    }
}
