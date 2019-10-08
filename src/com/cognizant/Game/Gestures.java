package com.cognizant.Game;

public enum Gestures {
    rock(1), paper(2), scissors(3);

    private int type;

    Gestures(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }


}
