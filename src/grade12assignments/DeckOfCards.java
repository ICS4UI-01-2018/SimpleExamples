/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade12assignments;

/**
 *
 * @author lamon
 */
public class DeckOfCards {

    private Card[] cards;
    private int numCards;
    
    public DeckOfCards(){
        numCards = 0;
        cards = new Card[52];
        int i = 0;
        for(int suit = 0; suit < 4; suit++){
            for(int rank = 1; rank <= 13; rank++){
                // create a card
                Card c = new Card(rank, suit);
                // add card to deck
                cards[i] = c;
                // move counters
                i++;
                numCards++;
            }
        }
    }
    
    // Knuth Shuffle or Fischer-Yates Shuffle
    public void shuffle(){
        for(int i = 0; i < this.numCards;i++){
            int spot = (int)(Math.random()*((this.numCards - 1)- i + 1) + i);
            Card temp = cards[i];
            cards[i] = cards[spot];
            cards[spot] = temp;
        }
    }
    
    public Card dealCard(){
        // get the card from the deck
        Card c = cards[this.numCards - 1];
        // make its old spot blank
        cards[this.numCards - 1] = null;
        // decrease the card count
        this.numCards--;
        // deal the card
        return c;
    }
    
    public int getNumCards(){
        return this.numCards;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        int num = deck.getNumCards();
        for(int i = 0; i < num; i++){
            Card c = deck.dealCard();
            System.out.println(c);
        }
    }
    
}
