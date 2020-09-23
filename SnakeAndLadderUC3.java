package com.BridgeLabz.SnakeAndLadder;

public class SnakeAndLadderUC3 {
	 public static void main(String[] args) {
		    int NO_OF_PLAYERS = 1;
			int CURRENT_POSITION = 0;
			double DICE_OUTPUT = Math.floor(Math.random() *10) %6 +1.0;
			
			int PLAY_OPTION = (int)Math.floor(Math.random() *10) %3;
			// Option number is 0 if no play
			if(PLAY_OPTION == 0)
				CURRENT_POSITION = CURRENT_POSITION;
			//Option number is 1 if ladder
			else if(PLAY_OPTION == 1)
				CURRENT_POSITION = CURRENT_POSITION + (int)DICE_OUTPUT;
			//Option number is 2 if snake
			else if(PLAY_OPTION == 2)
				CURRENT_POSITION = CURRENT_POSITION - (int)DICE_OUTPUT;
			
			System.out.println("Dice Output: "+(int)DICE_OUTPUT);
			System.out.println("Option: "+(int)PLAY_OPTION);
			System.out.println("Current Position: "+(int)CURRENT_POSITION);
			
	}
}
