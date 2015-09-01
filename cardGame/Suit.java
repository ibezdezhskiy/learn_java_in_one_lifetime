package cardGame;
/**
 * French-style playing cards are the Western standard for card games involving a deck of cards. 
 * These cards typically have four suits, representing different royal families.
 * Each suit has the same number of cards, all of equal rank distribution. 
 * (see CardRank class for more information).
 * Clubs are a weapon. Diamonds are shields. Hearts are shields. Spades, frequently called "Swords," are weapons. 
 */

/*
 * Future enhancements: color of suit, location of image of suit
 */

public enum Suit
{
	CLUBS  (" of clubs", "black"),
	DIAMONDS  (" of diamonds" , "red"),
	HEARTS  (" of hearts" , "red"),
	SPADES  (" of spades" , "black");
	
	private String name = "";
	private String color = "";
	
	private Suit (String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
}
