package guessNumber;

import java.util.Scanner;

public class guessNumMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		gameManager manager = gameManager.getgameManager();
		
		//initialize the game
		
		System.out.println("enter minimum number value");
		int minVal = sc.nextInt();
		
		System.out.println("enter maximum number value");
		int maxVal = sc.nextInt();
		manager.prepareGame(minVal,maxVal);
		
		
		//add user
		sc.nextLine();
		System.out.println("enter usernames type exit once done ");
		int playerCount = 0;
		while(true)
		{
			String userName = sc.nextLine().trim();
			
			if(userName.equalsIgnoreCase("exit"))
			{
				break;
			}
			else
			{
				manager.addUser(userName);
				playerCount++;
				
			}
				
			
		}
		
		
		
		//start game
		manager.startGame();
		
		//ask users for their guess
		
			manager.askForNum();
	
		
	}

}
