package com.cognizant.Game;

import com.cognizant.Player;

public class History {
    Player winner;
    Player looser;

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLooser() {
        return looser;
    }

    public void setLooser(Player looser) {
        this.looser = looser;
    }

    History(Player winner, Player looser) {
            this.winner = winner.clone();
            this.looser = looser.clone();
    }

    @Override
    public String toString() {
        return  "---------------------------------------------------\n\n" +
                "Winner: "+winner.getName()+" ("+winner.getLastMove()+")\n" +
                "Loser: "+looser.getName()+" ("+looser.getLastMove()+")\n\n";
    }
}
