package pacman;

import javax.swing.*;


public class GameFrame extends JFrame {

		Board board;	
	
		public void makeWindow(){
			
			board = new Board();
			board.setFocusable(true);
			super.add(board);
			super.setLocation(400,100);
			super.setResizable(false);
			super.setSize(500, 500);
			super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
			super.setVisible(true);
	
			while(board.isWin() == false){
				
			}
			GameSound.gameOverSound();
			JOptionPane.showMessageDialog(null, "You have won the game!!!");
			super.dispose();
			
			
		}
	
		
		
	
}
