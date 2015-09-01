package cardGame;

import java.util.List;
import java.util.Scanner;

public class CardGame
{
	static final String gameType = "blackjack";
	static Scanner scanner = new Scanner(System.in);
	static FrenchDeck deck = new FrenchDeck();
	
	public static void main(String[] args)
	{
		deck.shuffle();
		Player dealer = new Player("Dealer", false);
		Player player1;
		
		
		Boolean bust = false;
		Boolean win = false;
		Boolean blackjack = false;
		
		for(int turn = 0; bust || win ;)
		{
			if(turn == 0)
			{
				System.out.println("Player 1, enter your name: ");
				player1 = new Player(scanner.next(), true);
				if(player1 != null)
				{
					System.out.println("Welcome to the game, " + player1.getName() + ".");
					System.out.println("The game begins now.");
					printRules();
					turn ++;
				}
			if(turn == 1)
			{
				while(player1.getHand().size() < 2)
				{
					dealer.getHand().add(deck.drawTopCard());
					dealer.getHand().add(deck.drawTopCard());
					player1.getHand().add((deck.drawTopCard()));
					player1.getHand().add((deck.drawTopCard()));
					System.out.println("Dealing the cards...");
					System.out.println("Dealer's shown card is " 
					+ dealer.getHand().get(1).getName());
					System.out.println(player1.getName() + "'s shown card is " 
							+ player1.getHand().get(1).getName());
				}
			}
			if(turn > 2)	
			{
				
			}
				
			
				
		}

	}

}
	static final private void printRules()
	{
		System.out.println("The object of the game of Blackjack is to achieve a");
		System.out.println("combined card value of 21, or as close to 21 without");
		System.out.println("going over that value or being lower than the dealer's hand.");
		System.out.println("Each player is first dealt two cards");
		System.out.println("An ace and a face card (or a ten) on the first hand is a blackjack");
		System.out.println("and automatically wins the round.");
		System.out.println("A tie is called a 'Push' and results in a no-win round.");
		System.out.println("On your turn you may call for a new card ('Hit') or keep the hand");
		System.out.println("you have ('Stay'). Once all the players have made their choice to");
		System.out.println("stay, the card totals are tallied up and the highest value not over 21");
		System.out.println("is the winner of the round.");
	}

	
	static private String checkRoundStatus(String gameType, Player dealer, Player player1, int turn)
	{
		String winCondition = "false";
		
		int dealerHand = dealer.getHandStrength(gameType, turn);
		int playerHand = player1.getHandStrength(gameType, turn);
		
		if(turn == 1 && dealerHand == 21 && playerHand < dealerHand)
		{
			winCondition = "dealer blackjack";
		}
		if(turn == 1 && playerHand == 21 && playerHand > dealerHand)
		{
			winCondition = "player blackjack";
		}
		if(turn == 1 && playerHand == 21 && playerHand == dealerHand)
		{
			winCondition = "push";
		}
		if(turn == 1 && playerHand != 21 && dealerHand != 21)
		{
			winCondition = "false";
		}
		if(turn > 1 && dealerHand > 21)
		{
			winCondition = "dealer bust";
		}
		if(turn > 1 && playerHand > 21)
		{
			winCondition = "player bust";
		}
		if(turn > 1 && playerHand == dealerHand)
		{
			winCondition = "push";
		}
		if(turn > 1 && playerHand < 21 && dealerHand < 21 && playerHand > dealerHand)
		{
			winCondition = "player win";
		}
		if(turn > 1 && playerHand <= 21 && dealerHand <= 21 && playerHand < dealerHand)
		{
			winCondition = "dealer win";
		}
		return winCondition;
	}
	
	private String promptUserAction(Player player)
	{
		Scanner userDoes = new Scanner(System.in);
		String userAction = "";
		
		if(player.getIsHuman() == true)
			{
				System.out.println("You may declare your action (Hit/Stand): ");
			
				userAction = userDoes.next();
		
				switch(userAction) 
				{
				case "hit" : case "Hit" : case "H" :
					List<Card> currentHand = player.getHand();
					currentHand.addAll()
			
				}
		
			}
		return userAction;
	}
}

