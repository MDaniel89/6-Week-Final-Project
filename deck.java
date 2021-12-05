package Week6_FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author markitadaniel
 *
 */
public class Deck {
	
	
List<Card> cards = new ArrayList<Card>();

public Deck() {
	for (int i = 2; i < 15; i++) {
		cards.add(new Card (i, "Diamonds"));
		cards.add(new Card (i, "Hearts"));
		cards.add(new Card (i, "Clubs"));
		cards.add(new Card (i, "Spades"));}
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
