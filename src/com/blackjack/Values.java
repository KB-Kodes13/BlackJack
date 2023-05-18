package com.blackjack;

public enum Values {

    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four",4),
    FIVE("Five",5),
    SIX("Six",6),
    SEVEN("Seven",7),
    EIGHT("Eight",8),
    NINE("Nine",9),
    TEN("Ten",10),
    JACK("Jack",10),
    QUEEN("Queen",10),
    KING("King",10),
    ACE("Ace", 11);




    //create variables for the Values enum
    String rankName;
    int rankValue;

    //create a constructor
    Values(String rankName, int rankValue) {
        this.rankName = rankName;
        this.rankValue = rankValue;
    }

    //insert toString to specify how the Values enum should be represented as a string
    public String toString() {
        return rankName;
    }
}
