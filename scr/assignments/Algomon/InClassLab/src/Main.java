/*
 * === 1st Menu ===
 * 1 - Register player { we need to check if we have up to, but no less than, 2 players }
 * 2 - Pick your Algomons { check if we have 2 players; Show available algomons ;First player choose 4; Second player
 * choose 4 }
 * === 2nd Menu ===
 * 3 - Start Game { check if we have 2 players with 4 algomons each }
 * 4 - Player 1 - Choose your champion { display all the algomons available for the player }
 * 6 - Player 2 - Choose your champion { display all the algomons available for the player }
 * 5 - Player 1 - Choose your Action { Choose between your actions for the specific Algomon }
 * 7 - Player 2 - Choose your Action { Choose between your actions for the specific Algomon; BATTLE -> Show the pos
 * fight status -  }
 * 8 - Finish game
 *
 * - Verify if the algomon has health to play before being chosen
 * - If there is no algomon with health, end game
 * */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    boolean validInput = true;
    // create players
    Player player1 = new Player();
    Player player2 = new Player();

    // instanciate Algomons Manager
    AlgomonManager algomonManager = new AlgomonManager();

    // creating static algomons

    algomonManager.algomonsMenu(new Algomon(1, AlgomonTypes.FIRE, 100, 40, 15, 40));
    algomonManager.algomonsMenu(new Algomon(2, AlgomonTypes.WATER, 100, 15, 25, 60));
    algomonManager.algomonsMenu(new Algomon(3, AlgomonTypes.EARTH, 100, 30, 40, 5));
    algomonManager.algomonsMenu(new Algomon(4, AlgomonTypes.SUN, 100, 40, 5, 40));
    algomonManager.algomonsMenu(new Algomon(5, AlgomonTypes.MOON, 100, 25, 40, 40));
    algomonManager.algomonsMenu(new Algomon(6, AlgomonTypes.STAR, 100, 25, 25, 60));
    algomonManager.algomonsMenu(new Algomon(7, AlgomonTypes.FIRE, 100, 40, 15, 40));
    algomonManager.algomonsMenu(new Algomon(8, AlgomonTypes.WATER, 100, 15, 25, 60));

    System.out.println("Welcome to Algomon! To start, each player choose 4 champions");
    int option = 0;
    for (int i = 1; i <= 4; ++i) {
      System.out.println("[PLAYER 1] choose your" + i + "champions by ID: ");
      // display all algomons available
      algomonManager.listAlgomons();
      int chosenAlgomon = scanner.nextInt();
      player1.addAlgomon(chosenAlgomon);
      algomonManager.removeAlgomon(chosenAlgomon);
    }
    for (int i = 1; i <= 4; ++i) {
      System.out.println("[PLAYER 2] choose your" + i + "champions by ID: ");
      // display all algomons available
      algomonManager.listAlgomons();
      int chosenAlgomon = scanner.nextInt();
      player2.addAlgomon(chosenAlgomon);
      algomonManager.removeAlgomon(chosenAlgomon);
    }
    while (running) {
      switch (option) {
        case 1:
          System.out.println("[PLAYER 1] Choose your Algomon:");
          player1.listAlgomons();
          int algomonIndex1 = scanner.nextInt() - 1;
          break;

        case 2:
          System.out.println("[PLAYER 2] Choose your Algomon:");
          player2.listAlgomons();
          int algomonIndex2 = scanner.nextInt() - 1;
          break;

        case 3:
          System.out.println("Battle starting soon...");
          break;

        case 4:
          System.out.println("Exiting game.");
          running = false;
          break;

        default:
          System.out.println("Invalid choice. Try again.");
      }
    }
    scanner.close();
  }
}
