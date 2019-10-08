package com.cognizant.Game;

class Messages {
    static String mainMenu() {
        return "Menu\n" +
                "=======\n" +
                "1. 2 Players\n" +
                "2. vs. Computer\n" +
                "Please Enter your Selection number(1 or 2):";
    }

    static String nextMenu(){
        return "1. Type 'play' to play.\n" +
                "2. Type 'history' to view your game history.\n" +
                "3. Type 'quit' to stop playing.\n"+
                "Please Enter:";
    }
}
