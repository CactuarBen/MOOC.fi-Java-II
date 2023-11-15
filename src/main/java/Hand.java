
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public void sortBySuit(){
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = this.cards.stream().map(card -> card.getValue()).reduce(0,(a,b) -> a + b);
        int otherValue = otherHand.cards.stream().map( card -> card.getValue()).reduce(0, (a, b) -> a + b);
        return thisValue - otherValue;
    }
   

}
