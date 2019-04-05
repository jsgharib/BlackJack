package Blackjack;

public class Dealer extends AbstractPlayer{
    private Deck deck = new Deck();
    
    public Dealer(){
        super();
    }
    
    public void shuffle(){
        deck.shuffle();
    }
    
    public Card deal(){
        return deck.nextCard();
    }
    
    public boolean hit(){
        if(super.getHandValue() < 17){
            return true;
        }
        return false;
    }
}