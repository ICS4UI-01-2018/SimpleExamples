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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card c1 = new Card(5,Card.DIAMONDS);
        Card c2 = new Card(10,Card.SPADES);
        
        c1.flip();
        System.out.println("c1 is visible: " + c1.isVisible());
        System.out.println("c2 is visible: " + c2.isVisible());
    }
    
}
