package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class BlackJackCard extends Card {
    
    public BlackJackCard(int cardRank, String cardSuit) {
        super(cardRank,cardSuit);
    }
    public BlackJackCard(){
    }
    public int getValue() {
        return super.pointValue();
    }

}
