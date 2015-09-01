package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player
{	
	private String name = "Player Name Not Found";
	private int turn = 0;
	private List<Card> hand = new ArrayList<Card>();
	private Boolean isHuman = true;

	public Player(String name, Boolean isHuman)
	{
		this.setName(name);
		this.setIsHuman(isHuman);
	}
	
	public String getName()
	{
		return name;
	}
	
	private void setName(String name)
	{
		this.name = name;
	}
	
	public int getTurn()
	{
		return turn;
	}
	
	public void setTurn(int turn)
	{
		this.turn = turn;
	}
	
	public List<Card> getHand()
	{
		return hand;
	}
	
	public void setHand(List<Card> hand)
	{
		this.hand = hand;
	}
	
	public Boolean getIsHuman()
	{
		return isHuman;
	}

	private void setIsHuman(Boolean isHuman)
	{
		this.isHuman = isHuman;
	}
	
	public int getHandStrength(String gameType, int turn)
	{
		int totalStrength = 0;
		List<Card> currentHand = this.getHand();
		if(gameType == "blackjack")
		{
			for(Card card : currentHand)
			{	
						if(turn == 0)
						{
							System.out.println("Cards aren't dealt yet!");
							break;
						}	
						if(turn == 1)
						{
							if(card.getRank() == Rank.ACE && totalStrength == 10)
							{
								totalStrength += 11;
								break;
							}
							else
							{
								totalStrength += card.getRank().getCardStrength();
							}
						}
						if(turn > 1)
						{
							if(card.getRank() == Rank.ACE && totalStrength >= 10)
							{
								totalStrength +=1;
								break;
							}
							else
								{
									totalStrength += card.getRank().getCardStrength();
								}
						}
						
			}
		}
		return totalStrength;
	}
}

