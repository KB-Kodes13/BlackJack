package com.blackjack;

public enum Suit {
    HEART("Hearts"),
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    SPADE("Spades");
    // create variables for Suit enum
    String suitName;

    //add a constructor
    Suit(String suitName) {
        this.suitName = suitName;
    }
    //insert toString to specify how the Suit enum should be represented as a string
    public String toString() {
        return suitName;
    }
}
