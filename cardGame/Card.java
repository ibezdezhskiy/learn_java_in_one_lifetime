package cardGame;

public class Card
{
	private String name = "";
	private Rank rank;
	private Suit suit;
	
	public Card(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
		this.name = rank.getName() + suit.getName();
	}

	public String getName()
	{
		return name;
	}

	public Rank getRank()
	{
		return rank;
	}

	public Suit getSuit()
	{
		return suit;
	}
}
