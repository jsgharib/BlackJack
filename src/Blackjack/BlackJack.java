package Blackjack;

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack {
    private Player user = new Player();
    private Dealer dealer = new Dealer(); 

    public BlackJack() {
        
    }

    public void playGame() {
        user.resetHand();
        dealer.resetHand();
         Scanner keyboard = new Scanner(System.in);
         dealer.shuffle();
         
         
         user.addCardToHand(dealer.deal());
         user.addCardToHand(dealer.deal());
         
         dealer.addCardToHand(dealer.deal());
         dealer.addCardToHand(dealer.deal());
         
         System.out.println("Your hand is " + user.getHandValue() + " \nDealer's hand is: " + dealer.getHandValue());
         
         while(user.getHandValue() <= 21){
             if (playerHit()){
                    user.addCardToHand(dealer.deal());
                    System.out.println("Your hand value is now " + user.getHandValue());
             }else{
                 break;
             }
         }
         while(dealer.getHandValue() < 17){
             if (dealerHit()){
                 dealer.addCardToHand(dealer.deal());
                 System.out.println("Dealer's hand is now " + dealer.getHandValue());
             }
         }
         boolean bust = false;
         if (user.getHandValue() > 21 || dealer.getHandValue() > 21){
             if(dealer.getHandValue() >21 && user.getHandValue() >21){
                 System.out.println("Both busted!");
                 bust = true;
             }
             if (user.getHandValue() > 21){
                 System.out.println("You busted, Dealer wins!");
                 dealer.setWinCount(dealer.getWinCount() + 1);
                 bust = true;
             } else if(dealer.getHandValue() >21){
             System.out.println("Dealer busted, You win!");
              user.setWinCount(user.getWinCount() + 1);
              bust = true;
             }
         }
         if(user.getHandValue() == dealer.getHandValue() && !bust){
             System.out.println("Tie!");
         }
         else if (user.getHandValue() > dealer.getHandValue() && !bust){
                 System.out.println("You win");
                 user.setWinCount(user.getWinCount() + 1);
         } else if (!bust){
            System.out.println("Dealer wins!");
            dealer.setWinCount(dealer.getWinCount() + 1);
         }
         System.out.println("Dealer's score: " + dealer.getWinCount() +". \nYour score: " + user.getWinCount());
         playAgain();
         }
       
    

    public static void main(String[] args) {
         BlackJack game = new BlackJack();
         game.playGame();
    }
    public boolean playerHit(){
        return  user.hit();
    }
    public boolean dealerHit(){
         return dealer.hit();
    }
    
    public void playAgain(){
         Scanner key = new Scanner(System.in);
         System.out.print("Play again? ");
         String word = key.nextLine();
         char ans = word.toUpperCase().charAt(0);
         if (ans == 'Y'){
             System.out.println("\n\n\n");
             playGame();
         }
        
    }
}
