
import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToeMulti {

    static Scanner scanner = new Scanner(System.in);

    static String whoIsPlaying = "";
    static ArrayList<String> choices = new ArrayList<>();

    public static void startTicTacToe() {

        choices.removeAll(choices);     // Restart Game
        for (int a = 0; a < 9; a++) {
            choices.add(" ");
        }

        System.out.println("----------------- TIC TAC TOE -----------------");
        System.out.println("Game Rules: ");
        System.out.println("[] First one to create a straight line "
                + "\n   (diagonal, horizontal, vertical) wins.");
        System.out.println("[] Player 1 = X");
        System.out.println("[] Player 2 = O");
        System.out.println("[] Good luck!");
        System.out.println("-----------------------------------------------");

        System.out.println("\nGUIDE:");
        guideBoard();

        System.out.println();
        player1Choice();

    }

    public static void player1Choice() {

        System.out.print("[Player 1] Enter Choice: ");
        int firstPlayer = Integer.parseInt(scanner.nextLine()) - 1;

        whoIsPlaying = "PLAYER1";
        checkIfChoiceIsPossible(firstPlayer);

        playGoesOn();
        gameBoard();
        player2Choice();

    }

    public static void player2Choice() {

        System.out.print("[Player 2] Enter Choice: ");
        int secondPlayer = Integer.parseInt(scanner.nextLine()) - 1;

        whoIsPlaying = "PLAYER2";
        checkIfChoiceIsPossible(secondPlayer);

        playGoesOn();
        gameBoard();
        player1Choice();

    }

    public static void playGoesOn() {

        switch (whoIsPlaying) {

            case ("PLAYER1"):

                if (       choices.get(0).equals("X") && choices.get(1).equals("X") && choices.get(2).equals("X")
                        || choices.get(2).equals("X") && choices.get(5).equals("X") && choices.get(8).equals("X")
                        || choices.get(6).equals("X") && choices.get(7).equals("X") && choices.get(8).equals("X")
                        || choices.get(0).equals("X") && choices.get(3).equals("X") && choices.get(6).equals("X")
                        || choices.get(3).equals("X") && choices.get(4).equals("X") && choices.get(5).equals("X")
                        || choices.get(1).equals("X") && choices.get(4).equals("X") && choices.get(7).equals("X")
                        || choices.get(0).equals("X") && choices.get(4).equals("X") && choices.get(8).equals("X")
                        || choices.get(2).equals("X") && choices.get(4).equals("X") && choices.get(6).equals("X")) 
                {
                    System.out.println("\n[] Player 1 WON!");

                    gameBoard();
                    promptIfPlayAgain();

                }
                break;

            case ("PLAYER2"):

                if (       choices.get(0).equals("O") && choices.get(1).equals("O") && choices.get(2).equals("O")
                        || choices.get(2).equals("O") && choices.get(5).equals("O") && choices.get(8).equals("O")
                        || choices.get(6).equals("O") && choices.get(7).equals("O") && choices.get(8).equals("O")
                        || choices.get(0).equals("O") && choices.get(3).equals("O") && choices.get(6).equals("O")
                        || choices.get(3).equals("O") && choices.get(4).equals("O") && choices.get(5).equals("O")
                        || choices.get(1).equals("O") && choices.get(4).equals("O") && choices.get(7).equals("O")
                        || choices.get(0).equals("O") && choices.get(4).equals("O") && choices.get(8).equals("O")
                        || choices.get(2).equals("O") && choices.get(4).equals("O") && choices.get(6).equals("O")) 
                {
                    System.out.println("\n[] Player 2 WON!");

                    gameBoard();
                    promptIfPlayAgain();

                }

                break;

        }

        boolean haveChoices = false;

        for (int a = 0; a < choices.size(); a++) {
            if (choices.get(a).equals(" ")) {
                haveChoices = true;
                break;
            }
        }

        if (haveChoices == false) {  // All choices have been played.

            System.out.println("\n-----------------------------------------------");
            System.out.println("[] No More Choice(s)!");
            System.out.println("[] Game Ends!");

            gameBoard();
            promptIfPlayAgain();

        }

    }

    public static void checkIfChoiceIsPossible(int player) {

        int[] choicesAvailable = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        boolean goContinue = false;

        for (int a = 0; a < choicesAvailable.length; a++) {
            if (player == choicesAvailable[a]) {
                goContinue = true;
                break;
            }
        }

        if (goContinue == true) {

            if (choices.get(player).equals("X") || choices.get(player).equals("O")) {

                System.out.println("[] Choice Already Taken!\n[] Please Try Another!");

                switch (whoIsPlaying) {

                    case ("PLAYER1"):
                        player1Choice();
                        break;
                    case ("PLAYER2"):
                        player2Choice();
                        break;

                }

            } else {

                if (whoIsPlaying.equals("PLAYER1")) {
                    choices.set(player, "X"); // Player 1
                } else {
                    choices.set(player, "O"); // Player 2
                }

            }

        } else {

            System.out.println("Invalid Choice!");

            switch (whoIsPlaying) {

                case ("PLAYER1"):
                    player1Choice();
                    break;
                case ("PLAYER2"):
                    player2Choice();
                    break;

            }

        }

    }

    public static void gameBoard() {

        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   " + choices.get(0) + "   |   " + choices.get(1) + "   |   " + choices.get(2) + "   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   " + choices.get(3) + "   |   " + choices.get(4) + "   |   " + choices.get(5) + "   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   " + choices.get(6) + "   |   " + choices.get(7) + "   |   " + choices.get(8) + "   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");

    }

    public static void guideBoard() {

        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   1   |   2   |   3   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   4   |   5   |   6   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");
        System.out.println("|       |       |       |");
        System.out.println("|   7   |   8   |   9   |");
        System.out.println("|       |       |       |");
        System.out.println("+-----------------------+");

    }

    public static void promptIfPlayAgain() {

        System.out.println("-----------------------------------------------");
        System.out.println("PLAY AGAIN?");

        System.out.print("Enter Choice [y/n]: ");
        String playAgain = scanner.nextLine().toLowerCase();

        System.out.println();
        switch (playAgain) {

            case ("y"):

                startTicTacToe();

                break;
            case ("n"):

                System.out.println("[] Terminating Program.");
                System.out.println("[] Tic Tac Toe - Exit.");
                System.out.println("-----------------------------------------------");
                System.exit(0);

                break;
            default:

                System.out.println("[] Invalid Choice!");
                promptIfPlayAgain();

        }
    }

    public static void main(String[] args) {

        startTicTacToe();

    }

}
