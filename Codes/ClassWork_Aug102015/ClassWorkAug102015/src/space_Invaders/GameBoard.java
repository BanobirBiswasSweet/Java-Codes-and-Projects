package space_Invaders;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JPanel implements KeyListener{

	
	SpaceShip ship;
	Ghost[] ghosts = new Ghost[14];
	Bullet[] bullets = new Bullet[14];
	int bulletCount = 0;
	
	public GameBoard(){
		
		
		ship = new SpaceShip(250,510,"images//spaceship.png");
		
		int xGhost = 5, yGhost = 5;
		
		for(int i = 0; i < ghosts.length; i++){
			
			ghosts[i] = new Ghost(xGhost + 40 * i ,yGhost,"images//ghost.png",true);
			bullets[i] = new Bullet(-5,-5,"images//bullet.png");
		}
		
		
		super.addKeyListener(this);
		super.setFocusable(true);
		
		
		
		
	}
	
	
	public void paint(Graphics g){
		
		ImageIcon background = new ImageIcon("images//background.png");
		g.drawImage(background.getImage(),0,0,null);
		
		ship.draw(g);
		
		for(int i = 0; i < ghosts.length; i++){
			
			if(ghosts[i].isAlive() == true)
				ghosts[i].draw(g);
			
			bullets[i].draw(g);
			
		}
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == e.VK_LEFT)
		{
		
			
			if(ship.getX() > 0)
				ship.setX(ship.getX() - 1);
			
		}
		else if(e.getKeyCode() == e.VK_RIGHT)
		{
			if(ship.getX() < 550)
				ship.setX(ship.getX() + 1);
			
		}
		
		else if(e.getKeyCode() == e.VK_UP){
			
			bullets[bulletCount].setX(ship.getX() + 25); 	
			bullets[bulletCount].setY(ship.getY());
			
			BulletFiring bulletFire = new BulletFiring(this,ghosts,bullets[bulletCount]);
			bulletFire.start();
			
			bulletCount++;
			
			if(bulletCount == 13)
				bulletCount = 0;
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
