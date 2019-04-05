package Blackjack;

public abstract class Card {

    private String suit;
    private String rank;
    private int pointValue;
    public abstract int getValue();

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }
    
    public Card(int cardVal, String cardSuit) {
        pointValue = this.pointValue(cardVal);
        suit = cardSuit;
        rank =  this.rank(cardVal);
    }
    public Card(){
        rank = "Zero";
        suit = "Zero";
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    public int pointValue() {
        return pointValue;
    }
    
    public String rank(int rank) {
         String[] ranks = {"ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
         return ranks[rank-1];
    }
    
    public int pointValue(int val) {
        if(val == 1){
            return 11;
        }
        if(val > 10){
            return 10;
        }
        return val;
    }

    public boolean matches(Card otherCard) {
        return otherCard.suit().equals(this.suit())
                && otherCard.rank().equals(this.rank())
                && otherCard.pointValue() == this.pointValue();
    }

    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
