package Blackjack;

import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable {

    private ArrayList<Card> hand= new ArrayList<Card>();
    private int winCount;

    public AbstractPlayer(){
        
    }
    
    public void addCardToHand(Card temp) {
           hand.add(temp);
    }

    public void resetHand() {
        hand.clear();
    }

    public void setWinCount(int numwins) {
        winCount = numwins;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getHandSize() {
        return hand.size();
    }

    public int getHandValue() {
         int total = 0;
         for(Card a : hand){
             total += a.pointValue();
         }
         return total;
    }

    public String toString() {
        return "hand = " + hand.toString() + " \n-  # wins " + winCount;
    }
}
