/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade12assignments;

import java.awt.Color;

/**
 *
 * @author lamon
 */
public class Card {

    // instance(class) variables/fields
    private int suit;
    private int rank;
    private Color colour;
    private boolean isVisible;
    
    // class constants
    public static final int SPADES = 0;
    public static final int CLUBS = 1;
    public static final int HEARTS = 2;
    public static final int DIAMONDS = 3;
    
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 1;
    
    // Constructor for card
    // initialize variables and such
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
        this.isVisible = false;
        if(suit == CLUBS || suit == SPADES){
            this.colour = Color.BLACK;
        }else{
            this.colour = Color.RED;
        }
        
    }
    
    // Suit accessor(getter) method
    public int getSuit(){
        return this.suit;
    }
    
    public int getRank(){
        return this.rank;
    }
    
    public Color getColour(){
        return this.colour;
    }
    
    public boolean isVisible(){
        return this.isVisible;
    }
    
    
    // flip the card
    public void flip(){
        this.isVisible = !this.isVisible;
    }
    
    // formatting printing of a card
    @Override
    public String toString(){
        String card = "";
        
        // start off with the rank of the card
        if(this.rank >= 2 && this.rank <= 10){
            card = card + this.rank + " of ";
        }else if(this.rank == ACE){
            card = card + "Ace of ";
        }else if(this.rank == JACK){
            card = card + "Jack of ";
        }else if(this.rank == QUEEN){
            card = card + "Queen of ";
        }else if(this.rank == KING){
            card = card + "King of ";
        }else{
            card = card + "ERROR of ";
        }
        
        // now add the suit
        if(this.suit == SPADES){
            card = card + "Spades";
        }else if(this.suit == HEARTS){
            card = card + "Hearts";
        }else if(this.suit == DIAMONDS){
            card = card + "Diamonds";
        }else if(this.suit == CLUBS){
            card = card + "Clubs";
        }else{
            card = card + "ERROR";
        }
        
        return card;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card c1 = new Card(5,Card.DIAMONDS);
        Card c2 = new Card(10,Card.SPADES);
        Card c3 = new Card(Card.ACE, Card.HEARTS);
        
        c1.flip();
        System.out.println("c1 is visible: " + c1.isVisible());
        System.out.println("c2 is visible: " + c2.isVisible());
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
}
