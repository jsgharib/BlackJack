package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;
import java.util.Scanner;

public class Player extends AbstractPlayer{
    public Player(){
        super();
    }
        public Scanner key = new Scanner(System.in);
    
    public boolean hit(){
         System.out.println("Your score is " + super.getHandValue() + ". Do you want to hit?");
         String word = key.nextLine();
         char ans = word.toUpperCase().charAt(0);
         if (ans == 'Y'){
             return true;
         }
         return false;
    }
}

