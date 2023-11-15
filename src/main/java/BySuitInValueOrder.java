
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BySuitInValueOrder implements Comparator<Card> {
    
    public int compare(Card card1, Card card2){
        int suitValueOrder = card1.getSuit().ordinal() - card2.getSuit().ordinal();
        
        if (suitValueOrder == 0){
            return card1.compareTo(card2);
        }
        
        return suitValueOrder;
    }
    
}
