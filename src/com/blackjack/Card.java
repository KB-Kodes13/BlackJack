package com.blackjack;

public class Card {
    // create variables for the Card class
    private Suit suit;
    private Values values;

    //Create the constructor
    public Card(Suit suit, Values values) {
        this.suit = suit;
        this.values = values;
    }
    // add your getters
    public int getValue() {
        return values.rankValue;
    }
    public Suit getSuit(){
        return suit;
    }
    public Values getValues() {
        return values;
    }
    public Card(Card card){
        this.suit = card.getSuit();
        this.values = card.getValues();
    }

    // create toString to specify how the Card class should be represented as a string
    public String toString(){
        return ("["+values+" of "+ suit + "] ("+this.getValue()+")");

    }
}
