package Week6_FinalProject;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
	
	private List<Card> hand = new ArrayList<Card>();

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int score;
	
	private String name;
	
	
	public Player() {
		score = 0;
	}
	
	public Player(String newName) {
		name = newName;
		score = 0;
	}
	
	
	public void describe() {
		System.out.printf("Player %s has the following cards: \n", name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getFinalScore() {
		return score;
	}
}
