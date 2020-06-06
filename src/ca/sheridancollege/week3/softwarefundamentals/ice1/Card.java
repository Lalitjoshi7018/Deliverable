package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 *Lalit Joshi
 * 991529595
 */
public class Card {

   private String suit;
   private int value;
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
   public int randomValue(){
       int R = (int)(1+Math.random()*13);
       return R;
   }
   public String randomSuit(){
   int R = (int) (Math.random() * 4);
   String randomSuit = SUITS[R];
   return randomSuit;
   }
}
