package guessNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	int minVal;
	int maxVal;
	int generatedNum;
	
	List<User> userList;

	public Game(int minVal, int maxVal) {
		super();
		this.minVal = minVal;
		this.maxVal = maxVal;
		this.userList = new ArrayList<>();
		this.generatedNum = 0;
	}

	public int getMinVal() {
		return minVal;
	}

	public void setMinVal(int minVal) {
		this.minVal = minVal;
	}

	public int getMaxVal() {
		return maxVal;
	}

	public void setMaxVal(int maxVal) {
		maxVal = maxVal;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

	public int getGeneratedNum() {
		return generatedNum;
	}

	public void setGeneratedNum(int generatedNum) {
		this.generatedNum = generatedNum;
	}

	public void playGame() {
		//generate random number
		 Random random = new Random();
		
		int number = random.nextInt(maxVal - minVal + 1) + minVal;
		this.generatedNum = number;
        System.out.println("generated number is: "+generatedNum);
		
	}

	public void askForNum() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			for( User user : userList)
			{
				String username = user.getName();
				System.out.println(username + " enter your number :");
				int number = sc.nextInt();
				String msg = "";
				if(number > this.generatedNum)
				{
					msg = "too high";
					
					
				}
				else if( number < this.generatedNum)
				{
					msg= "too low";
				}
				else
				{
					msg = "match won the game!!!";
					//System.out.println(user.getName() + " won the game!!!");
					return;
				}
				user.notifyuser(msg);
				
			}
		}
		
		
		
	}
		
}
	
	
	
	
	
	

