package com.BridgeLabz.SnakeAndLadder;

public class SnakeAndLadderUC7 {
	public static void main(String[] args) {
	    int NO_OF_PLAYERS = 2;
		int CURRENT_POSITION_PLAYER1 = 0;
		int CURRENT_POSITION_PLAYER2 = 0;
		double DICE_OUTPUT_PLAYER1 =0.0;
		double DICE_OUTPUT_PLAYER2 =0.0;
		int PLAY_OPTION=0;
		int NUM_TIMES_DICE_ROLLED = 0;
		while(CURRENT_POSITION_PLAYER1 !=100 || CURRENT_POSITION_PLAYER2 !=100)
	{		
		DICE_OUTPUT_PLAYER1 = Math.floor(Math.random() *10) %6 +1.0;
		System.out.println("Current Position after dice rolled Player 1: "+(int)CURRENT_POSITION_PLAYER1);
		PLAY_OPTION = (int)Math.floor(Math.random() *10) %3;
		//Option number is 1 if ladder
		while(PLAY_OPTION == 1 && CURRENT_POSITION_PLAYER1 != 100 )
		{
			if(CURRENT_POSITION_PLAYER1 + (int)DICE_OUTPUT_PLAYER1 > 100)
				CURRENT_POSITION_PLAYER1 = CURRENT_POSITION_PLAYER1;
			    else
			    	CURRENT_POSITION_PLAYER1 = CURRENT_POSITION_PLAYER1 + (int)DICE_OUTPUT_PLAYER1;	
			
		
			DICE_OUTPUT_PLAYER1 = Math.floor(Math.random() *10) %6 +1.0;
			PLAY_OPTION = (int)Math.floor(Math.random() *10) %3;
			
		}
		// Option number is 0 if no play
		if(PLAY_OPTION == 0)
			CURRENT_POSITION_PLAYER1 = CURRENT_POSITION_PLAYER1;
		
		//Option number is 2 if snake
		else if(PLAY_OPTION == 2)
		{if(CURRENT_POSITION_PLAYER1 - DICE_OUTPUT_PLAYER1 >= 0)			
			CURRENT_POSITION_PLAYER1 = CURRENT_POSITION_PLAYER1- (int)DICE_OUTPUT_PLAYER1;
		
		else
			CURRENT_POSITION_PLAYER1 =0;
		}
		
		if(CURRENT_POSITION_PLAYER1 == 100)
		{
			System.out.println("Player 1 won");
			return;
		}
		
		DICE_OUTPUT_PLAYER2 = Math.floor(Math.random() *10) %6 +1.0;
		System.out.println("Current Position after dice rolled Player 2: "+(int)CURRENT_POSITION_PLAYER2);
		PLAY_OPTION = (int)Math.floor(Math.random() *10) %3;
		//Option number is 1 if ladder
		while(PLAY_OPTION == 1 && CURRENT_POSITION_PLAYER2 == 100)
		{
			if(CURRENT_POSITION_PLAYER2 + (int)DICE_OUTPUT_PLAYER2 > 100)
				CURRENT_POSITION_PLAYER2 = CURRENT_POSITION_PLAYER2;
			    else
			    	CURRENT_POSITION_PLAYER2 = CURRENT_POSITION_PLAYER2 + (int)DICE_OUTPUT_PLAYER2;	
			
			DICE_OUTPUT_PLAYER2 = Math.floor(Math.random() *10) %6 +1.0;
			PLAY_OPTION = (int)Math.floor(Math.random() *10) %3;
			
		}
		// Option number is 0 if no play
		if(PLAY_OPTION == 0)
			CURRENT_POSITION_PLAYER2 = CURRENT_POSITION_PLAYER2;
		
		//Option number is 2 if snake
		else if(PLAY_OPTION == 2)
		{if(CURRENT_POSITION_PLAYER2 - DICE_OUTPUT_PLAYER2 >= 0)			
			CURRENT_POSITION_PLAYER2 = CURRENT_POSITION_PLAYER2- (int)DICE_OUTPUT_PLAYER2;
		
		else
			CURRENT_POSITION_PLAYER2 =0;
		}
		
		if(CURRENT_POSITION_PLAYER2 == 100)
		{
			System.out.println("Player 2 won");
			return;
		}

	}
		
}
}
