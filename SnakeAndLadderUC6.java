package com.BridgeLabz.SnakeAndLadder;

public class SnakeAndLadderUC6 {
	 public static void main(String[] args) {
		    int NO_OF_PLAYERS = 1;
			int CURRENT_POSITION = 0;
			double DICE_OUTPUT =0.0;
			int PLAY_OPTION=0;
			int NUM_TIMES_DICE_ROLLED = 0;
			while(CURRENT_POSITION !=100)
		{		
			DICE_OUTPUT = Math.floor(Math.random() *10) %6 +1.0;
			NUM_TIMES_DICE_ROLLED++;
			System.out.println("Current Position after dice rolled: "+(int)CURRENT_POSITION);
			PLAY_OPTION = (int)Math.floor(Math.random() *10) %3;
			// Option number is 0 if no play
			if(PLAY_OPTION == 0)
				CURRENT_POSITION = CURRENT_POSITION;
			//Option number is 1 if ladder
			else if(PLAY_OPTION == 1)
			{	if(CURRENT_POSITION + (int)DICE_OUTPUT > 100)
				CURRENT_POSITION = CURRENT_POSITION;
			    else
				CURRENT_POSITION = CURRENT_POSITION + (int)DICE_OUTPUT;	
			}
			//Option number is 2 if snake
			else if(PLAY_OPTION == 2)
			{if(CURRENT_POSITION -DICE_OUTPUT >= 0)			
				CURRENT_POSITION = CURRENT_POSITION - (int)DICE_OUTPUT;
			
			else
				CURRENT_POSITION =0;
			}
		}
			
			System.out.println("NUMBER OF TIMES DICE ROLLED: "+NUM_TIMES_DICE_ROLLED);
			
	}

}
