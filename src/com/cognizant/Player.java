package com.cognizant;

import com.cognizant.Game.Gestures;

public abstract class Player {


    private String name;
    private boolean isTurn;
    private Gestures lastMove;
    private int wins;

    Player(Player player) {
        this(player.name, player.isTurn, player.lastMove, player.wins);
    }

    public Player(String name, boolean isTurn, Gestures lastMove, int wins) {
        this.name = name;
        this.isTurn = isTurn;
        this.lastMove = lastMove;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public Gestures getLastMove() {
        return lastMove;
    }

    public void setLastMove(Gestures lastMove) {
        this.lastMove = lastMove;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    protected Player(String name) {
        this.name = name;
    }

    @Override
    public Player clone() {
        return new Player(this) {
        };
    }
}
