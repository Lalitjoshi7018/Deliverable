package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 *Lalit Joshi
 * 991529595
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(c.randomSuit());
            magicHand[i]=c;
            System.out.println(magicHand[i]);
        }
        Card userCard = new Card();
        Scanner I = new Scanner(System.in);
        System.out.println("Enter your Card Suit");
        String userSuit = I.nextLine();
        System.out.println("Enter your Card Number ");
        int userNumber = I.nextInt();
        userCard.setSuit(userSuit);
        userCard.setValue(userNumber);
        
        boolean check = false;
        
        for (int i=0; i<magicHand.length; i++){
        if( (userSuit == magicHand[i].getSuit()) && (userNumber == magicHand[i].getValue())){
            check = true;
        }
        }
        if(check == true){
            System.out.println("Your Card is in Array");
        }
        else{
            System.out.println("Your Card is not in Array");
            
        }
    }
    }
