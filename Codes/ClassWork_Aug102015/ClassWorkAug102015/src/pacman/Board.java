package pacman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements KeyListener {

		final static int LENGTH = 500, WIDTH = 500;
		final int NUMOFBRICKS = 5, NUMOFGHOSTS = 5;
		
		Pacman pacman;
		Brick[] bricks = new Brick[NUMOFBRICKS];
		Ghost[] ghosts = new Ghost[NUMOFGHOSTS];
		
		public Board(){
			
			for(int i = 0; i < bricks.length; i++)
				bricks[i] = new Brick((int)(Math.random()*476),(int)(Math.random()*476),"images01//brick.png");
			
			for(int i = 0; i < ghosts.length; i++)
				ghosts[i] = new Ghost((int)(Math.random()*476),(int)(Math.random()*476),"images01//ghost.png");
			
			
			pacman = new Pacman(0,0,"images01//pacman.png");
			super.addKeyListener(this);
		}
		
		
		
		@Override
		public void paint(Graphics g){
		
			ImageIcon icon = new ImageIcon("images01//background.jpg");
			Image background = icon.getImage();
			g.drawImage(background,0,0,null);
			
			
			
			for(int i = 0; i < bricks.length; i++)
				bricks[i].draw(g);
			
			for(int i = 0; i < ghosts.length; i++){
			
				if(ghosts[i].getIsAlive() == true)
					ghosts[i].draw(g);
			}
		
			pacman.draw(g);
		
		}

		public boolean checkBrickCollision(){
			
			Rectangle pacmanRect = new Rectangle(pacman.getX(),pacman.getY(),30,30);
			
			for(int i = 0; i < NUMOFBRICKS; i++){
				
				Rectangle brickRect = new Rectangle(bricks[i].getX(),bricks[i].getY(),24,28);
				
				if(pacmanRect.intersects(brickRect) == true){
					GameSound.smashBricksSound();
					return true;
				}
			}
			
			return false;
			
		}
		
		public void eatGhost(){
			
			Rectangle pacmanRect = new Rectangle(pacman.getX(),pacman.getY(),30,30);
			
			for(int i = 0; i < NUMOFGHOSTS; i++){
				
				Rectangle ghostRect = new Rectangle(ghosts[i].getX(),ghosts[i].getY(),24,28);
				
				if(pacmanRect.intersects(ghostRect) == true && ghosts[i].getIsAlive() == true){ // the second condition has been added to check whether the ghost is alive or not, if alive then it will eat it otherwise it will keep beeping all day
					GameSound.eatGhostSound();
					ghosts[i].setAlive(false);
				}
			}
			
			
		}
		
		public boolean isWin(){
			
			for(int i = 0; i < NUMOFGHOSTS; i++)
				if(ghosts[i].getIsAlive() == true)
					return false;
			
			
			return true;
		}
		
		
		
		


		@Override
		public void keyPressed(KeyEvent e) {
			
				eatGhost();
			
				if(e.getKeyCode() == e.VK_UP){
					pacman.moveUp();
					
					if(checkBrickCollision()==true){
						pacman.moveDown();
						pacman.moveDown();
					}
					
				}
			
				if(e.getKeyCode() == e.VK_DOWN){
					pacman.moveDown();
				
					if(checkBrickCollision()==true){
						pacman.moveUp();
						pacman.moveUp();
					}
				
				
				
				}
				
				if(e.getKeyCode() == e.VK_LEFT){
					pacman.moveLeft();
					
					if(checkBrickCollision()==true){
						pacman.moveRight();
						pacman.moveRight();
					}
					
				}
			
				if(e.getKeyCode() == e.VK_RIGHT){
					pacman.moveRight();
					
					if(checkBrickCollision()==true){
						pacman.moveLeft();
						pacman.moveLeft();
					}
				}
		
				super.repaint();
				
		}



		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
}
