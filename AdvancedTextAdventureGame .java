import java.util.Scanner;

public class AdvancedTextAdventureGame {

    static int health = 100;
    static int gold = 0;
    static boolean hasMap = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Advanced Text Adventure Game!");
        System.out.println("You find yourself in a medieval kingdom. Your quest is to become a legendary hero.");

        while (health > 0) {
            System.out.println("\nChoose your next move:");
            System.out.println("1. Explore the village");
            System.out.println("2. Visit the castle");
            System.out.println("3. Head to the dark forest");
            System.out.println("4. Check your inventory");
            System.out.println("5. Quit the game");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    exploreVillage();
                    break;

                case 2:
                    visitCastle();
                    break;

                case 3:
                    enterDarkForest();
                    break;

                case 4:
                    checkInventory();
                    break;

                case 5:
                    gameOver("Thanks for playing! Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    private static void exploreVillage() {
        System.out.println("You explore the village and find a market square.");
        System.out.println("What do you want to do?");
        System.out.println("1. Visit the market");
        System.out.println("2. Enter the tavern");
        System.out.println("3. Return to the village entrance");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                visitMarket();
                break;

            case 2:
                enterTavern();
                break;

            case 3:
                System.out.println("You return to the village entrance.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void visitMarket() {
        System.out.println("You enter the bustling market.");
        System.out.println("What do you want to do?");
        System.out.println("1. Buy a sword");
        System.out.println("2. Purchase a health potion");
        System.out.println("3. Return to the market square");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You buy a sturdy sword for 50 gold.");
                gold -= 50;
                System.out.println("Your current gold: " + gold);
                break;

            case 2:
                System.out.println("You purchase a health potion for 30 gold.");
                gold -= 30;
                System.out.println("Your current gold: " + gold);
                break;

            case 3:
                System.out.println("You return to the market square.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void enterTavern() {
        System.out.println("You enter the lively tavern and meet the village folk.");
        System.out.println("What do you want to do?");
        System.out.println("1. Play a game of cards");
        System.out.println("2. Listen to rumors");
        System.out.println("3. Leave the tavern");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                playCardGame();
                break;

            case 2:
                listenToRumors();
                break;

            case 3:
                System.out.println("You leave the tavern and continue your journey.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void playCardGame() {
        System.out.println("You join a card game and win 20 gold!");
        gold += 20;
        System.out.println("Your current gold: " + gold);
    }

    private static void listenToRumors() {
        System.out.println("You overhear rumors about a dragon guarding a treasure in the dark forest.");
        System.out.println("Do you want to ask for more details?");
        System.out.println("1. Ask for details");
        System.out.println("2. Ignore the rumors");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("The villagers share information about the dragon's lair. You gain insights into the quest.");
            hasMap = true;
        } else {
            System.out.println("You decide to ignore the rumors and leave the tavern.");
        }
    }

    private static void visitCastle() {
        System.out.println("You enter the majestic castle.");
        System.out.println("What do you want to do?");
        System.out.println("1. Meet the king");
        System.out.println("2. Explore the royal library");
        System.out.println("3. Return to the castle entrance");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                meetKing();
                break;

            case 2:
                exploreLibrary();
                break;

            case 3:
                System.out.println("You return to the castle entrance.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void meetKing() {
        System.out.println("You meet the wise king who acknowledges your courage.");
        System.out.println("He grants you a special amulet for protection.");
        System.out.println("Your health is increased!");
        health += 30;
        System.out.println("Your current health: " + health);
    }

    private static void exploreLibrary() {
        System.out.println("You explore the vast royal library.");
        System.out.println("What do you want to do?");
        System.out.println("1. Read a book about dragon lore");
        System.out.println("2. Study ancient maps");
        System.out.println("3. Return to the castle");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You gain knowledge about dragon weaknesses.");
                break;

            case 2:
                System.out.println("You discover maps hinting at the dragon's lair in the dark forest.");
                hasMap = true;
                break;

            case 3:
                System.out.println("You return to the castle entrance.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void enterDarkForest() {
        System.out.println("You enter the ominous dark forest.");
        System.out.println("What do you want to do?");
        System.out.println("1. Follow the hidden path");
        System.out.println("2. Confront the dragon");
        System.out.println("3. Retreat and return to the village");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                followHiddenPath();
                break;

            case 2:
                confrontDragon();
                break;

            case 3:
                System.out.println("You decide to retreat and return to the village.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void followHiddenPath() {
        System.out.println("You follow a hidden path and discover a cave.");
        System.out.println("What do you want to do?");
        System.out.println("1. Enter the cave");
        System.out.println("2. Continue exploring the forest");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You find a chest with a substantial amount of gold!");
                gold += 100;
                System.out.println("Your current gold: " + gold);
                break;

            case 2:
                System.out.println("You continue exploring the forest.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private static void confrontDragon() {
        if (!hasMap) {
            System.out.println("You attempt to confront the dragon without proper information.");
            System.out.println("The dragon overwhelms you, and you suffer severe damage.");
            int dragonDamage = (int) (Math.random() * 50);
            health -= dragonDamage;
            System.out.println("The dragon inflicts " + dragonDamage + " damage.");
            System.out.println("Your current health: " + health);

            if (health <= 0) {
                gameOver("Game over! The dragon defeated you.");
            } else {
                System.out.println("You manage to escape the dragon's lair.");
            }
        } else {
            System.out.println("Armed with the knowledge from the map, you confront the dragon.");
            System.out.println("A fierce battle ensues!");

            int dragonHealth = 150;
            while (dragonHealth > 0) {
                int playerAttack = (int) (Math.random() * 30);
                int dragonAttack = (int) (Math.random() * 20);

                dragonHealth -= playerAttack;
                health -= dragonAttack;

                System.out.println("You dealt " + playerAttack + " damage to the dragon.");
                System.out.println("The dragon counterattacks, dealing " + dragonAttack + " damage.");
                System.out.println("Dragon's health: " + dragonHealth);
                System.out.println("Your current health: " + health);

                if (health <= 0) {
                    gameOver("Game over! The dragon defeated you.");
                }
            }

            System.out.println("Congratulations! You defeated the dragon and found the legendary treasure!");
        }
    }

    private static void checkInventory() {
        System.out.println("Inventory:");
        System.out.println("Gold: " + gold);
        System.out.println("Health: " + health);
        System.out.println("Map: " + (hasMap ? "Yes" : "No"));
    }

    private static void gameOver(String message) {
        System.out.println(message);
        System.exit(0);
    }
}