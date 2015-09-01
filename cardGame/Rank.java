/**
 * Ranks represent the type of card, as well as its strength when used in a card game. 
 * For example, a Queen is typically equivalent in strength to a 10 in Blackjack and Poker
 * Ace is a special case in certain games (varying in strength between 1, 10, and 11 depending on rules).
 * Ace strength should be accounted for within the game rules and game flow
 * 
 */

package cardGame;

public enum Rank
{
	TWO  ("two", 2),
	THREE ("three", 3),
	FOUR ("four", 4),
	FIVE ("five", 5),
	SIX ("six", 6),
	SEVEN ("seven", 7),
	EIGHT ("eight", 8),
	NINE ("nine", 9),
	TEN ("ten", 10),
	JACK ("jack", 10),
	QUEEN ("queen", 10 ),
	KING ("king", 10),
	ACE ("ace", 11);
	
	private String name = "";
	private int cardStrength = 0;
	
	private Rank(String name, int cardStrength) 
	{
		this.name = name;
		this.cardStrength = cardStrength;
	}
	
	public String getName()
	{
		return name;
	}

	public int getCardStrength()
	{
		return cardStrength;
	}
}
