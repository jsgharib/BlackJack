package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public static final int faceNum = 13;
    public static final int suitNum = 4;
    public static final int cardNum = 52;
    public static int size;

    public static final String SUITS[] = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

    private int topCardIndex;
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        topCardIndex = 51;
        for (int j = 1; j <= faceNum; j++) {
            for (String suitString : SUITS) {
                cards.add(new BlackJackCard(j,suitString));
            }
        }
        size = cards.size();
    }


    //modifiers
    public void shuffle() {
        topCardIndex = 51;
        for (int k = cards.size() - 1; k > 0; k--) {
            int howMany = k + 1;
            int start = 0;
            int randPos = (int) (Math.random() * howMany) + start;
            Card temp = cards.get(k);
            cards.set(k, cards.get(randPos));
            cards.set(randPos, temp);
            
        }
        size = cards.size();
    }

    //accessors
    public int size() {
        return size;
    }

    public int cardsLeft() {
        return topCardIndex+1;
    }

    public Card nextCard() {
        return cards.get(topCardIndex--);
    }

    public String toString() {
        return cards + "   topCardIndex = " + topCardIndex;
    }
}
