package guessNumber;

import java.util.List;
import java.util.Scanner;

public class gameManager {
	
	private static gameManager instance = null;
	Game game = null;
	private gameManager()
	{
		
	}
	
	
	public static gameManager getgameManager()
	{
		if(instance == null)
		{
			synchronized (gameManager.class) {
				
				if(instance == null)
				{
					instance = new gameManager();
				}
				
			}
		}
		
		return instance;
	}


	public void addUser(String userName) {
		User user = new User(userName);
		game.getUserList().add(user);
		
		System.out.println(userName +"  added successfully");
		
	}


	public void prepareGame(int minVal, int maxVal) {
		
		game = new Game(minVal,maxVal);
		System.out.println("Game with minimum value "+minVal+ " and maximum value "+maxVal+ " created successfully!");
	}


	public void startGame() {
		game.playGame();
		
	}


	public void askForNum() {
		game.askForNum();
		
	}

}
