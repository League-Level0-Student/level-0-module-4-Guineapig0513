package _02_boolean._3_game_over;

import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		boolean gameOver = false;
		
		// 1. Ask the user if the game is over and save their answer.
		while(gameOver == false) {
		String honk =JOptionPane.showInputDialog("Is the game over?");
		
		// 2. If they answer "yes" change gameOver to true.
		if(honk.equalsIgnoreCase("yes")) {
			gameOver = !gameOver;
		}
		}
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		JOptionPane.showMessageDialog(null, "The game is over");
		System.exit(0);
		// 4. Tell the user the game is over outside the while loop.
		
	}

}