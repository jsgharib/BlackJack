package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;
import java.awt.Color;

public class DeckTestOne {

    public static void main(String args[]) {
        Deck deck = new Deck();
        for (int i = 0; i < Deck.cardNum; i++) {
            out.println(deck.nextCard());
        }

        out.println("\n");

        out.println("num cards left in the deck == " + deck.cardsLeft());

        out.println("\nshuffling");
        deck.shuffle();
        out.println("num cards left in the deck == " + deck.cardsLeft());

        out.println("\ntoString");
        out.println(deck);
    }
}
