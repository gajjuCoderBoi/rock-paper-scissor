package com.cognizant.Game;

import com.cognizant.Player;

class Rules {
    static History getWinner(Player player1, Player player2) {
        if(player1.getLastMove() == player2.getLastMove()){
            System.out.println("It's a tie!!");
        }
        else if(player1.getLastMove() == Gestures.scissors){
            if(player2.getLastMove() == Gestures.paper){
                System.out.println(player1.getName()+ "("+player1.getLastMove() +") Wins!!");player1.setWins(player1.getWins()+1);player2.setWins(player2.getWins()-1);
                return new History(player1, player2);
            }else if(player2.getLastMove() == Gestures.rock){
                System.out.println(player2.getName()+ "("+player2.getLastMove() +") Wins!!");player2.setWins(player2.getWins()+1);player1.setWins(player1.getWins()-1);
                return new History(player2, player1);
            }
        }
        else if(player1.getLastMove() == Gestures.paper){
            if(player2.getLastMove() == Gestures.rock){
                System.out.println(player1.getName()+ "("+player1.getLastMove() +") Wins!!");player1.setWins(player1.getWins()+1);player2.setWins(player2.getWins()-1);
                return new History(player1, player2);
            }else if(player2.getLastMove() == Gestures.scissors){
                System.out.println(player2.getName()+ "("+player2.getLastMove() +") Wins!!");player2.setWins(player2.getWins()+1);player1.setWins(player1.getWins()-1);
                return new History(player2, player1);
            }
        }
        else if(player1.getLastMove() == Gestures.rock){
            if(player2.getLastMove() == Gestures.scissors){
                System.out.println(player1.getName()+ "("+player1.getLastMove() +") Wins!!");player1.setWins(player1.getWins()+1);player2.setWins(player2.getWins()-1);
                return new History(player1, player2);
            }else if(player2.getLastMove() == Gestures.paper){
                System.out.println(player2.getName()+ "("+player2.getLastMove() +") Wins!!");player2.setWins(player2.getWins()+1);player1.setWins(player1.getWins()-1);
                return new History(player2, player1);
            }
        }
        return null;
    }
}
