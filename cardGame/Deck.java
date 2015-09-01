package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck
{
	List<Card> cards = new ArrayList<Card>();
	
	public Deck(Suit[] suits, Rank[] ranks)
	{
		buildDeck(suits, ranks);
		this.shuffle();
	}
	
	
	private void buildDeck(Suit[] suits, Rank[] ranks)
	{
		for(Suit suit : suits)
		{
			for(Rank rank : ranks)
			{
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public void shuffle()
	{
		Collections.shuffle(this.cards);
	}
	
	public Card drawTopCard()
	{
		Card topCard = this.cards.get(0);
		cards.remove(topCard);
		return topCard;
	}
	
	public List<Card> getRemainingCards()
	{
		List<Card> myRemainingCards = this.cards;
		
		return myRemainingCards;
	}
}
