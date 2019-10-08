package com.cognizant.Game;

import com.cognizant.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static com.cognizant.Game.Messages.mainMenu;
import static com.cognizant.Game.Messages.nextMenu;
import static com.cognizant.Game.Rules.getWinner;

public class Game {
    private List<History> historyList;

    public void gameInit() {
        String input = getInput(mainMenu()).toLowerCase();
        historyList = new ArrayList<>();
        switch (input) {
            case "1":
                twoPlayers();
                break;
            case "2":
                vsComputer();
                break;
            case "quit":
                System.exit(0);
            default:
                System.out.println("Invalid Input!\nPlease Try Again\n\n");
        }
    }

    private void twoPlayers() {
        Player player1 = new Player(getInput("Enter Player1 Name:")) {
        };
        Player player2 = new Player(getInput("Enter Player2 Name:")) {
        };
        while (true)
            switch (getInput(nextMenu())) {
                case "play":
                    startGame(player1, player2, false);
                    break;
                case "history":
                    printHistory();
                    break;
                case "quit":
                    System.exit(0);
            }

    }

    private void vsComputer() {
        Player player1 = new Player(getInput("Enter Player Name:")) {
        };
        while (true)
            switch (getInput(nextMenu())) {
                case "play":
                    startGame(player1, new Player("Computer") {
                    }, true);
                    break;
                case "history":
                    printHistory();
                    break;
                case "quit":
                    System.exit(0);
            }

    }

    private void startGame(Player player1, Player player2, boolean isComputerOpponent) {
        while (true) {
            System.out.println("\nType 'rock', 'paper', or 'scissor' to play.\n" +
                    "Type 'quit' to go back to the main menu.\n");

            player1.setLastMove(getValidInput("Player 1 Input:"));
            if (player1.getLastMove() == null) return;
            if (isComputerOpponent) {
                player2.setLastMove(Gestures.values()[new Random().nextInt(Gestures.values().length)]);
            } else {
                player2.setLastMove(getValidInput("Player 2 Input:"));
                if (player2.getLastMove() == null) return;

            }
            History winner = getWinner(player1, player2);
            historyList.add(winner);
        }
    }

    private Gestures getValidInput(String msg) {
        String input = getInput(msg).toLowerCase();
        while (true) {
            switch (input) {
                case "rock":
                    return Gestures.rock;
                case "paper":
                    return Gestures.paper;
                case "scissor":
                    return Gestures.scissors;
                default: {
                    if (input.equals("quit"))
                        return null;
                    input = getInput("Invalid Input Please Try Again or 'quit' to quit!\nPlease Enter Again:");

                }
            }
        }
    }

    private String getInput(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        sc = new Scanner(System.in);
        return input;
    }

    private void printHistory() {
        System.out.println("\nHistory");
        for (int i = 1; i < historyList.size()+1; i++) {
            System.out.println("Round " + i);
            if(historyList.get(i-1)==null){
                System.out.println("it's a tie!!");
                continue;
            }
            System.out.println(historyList.get(i-1));
        }
    }
}
