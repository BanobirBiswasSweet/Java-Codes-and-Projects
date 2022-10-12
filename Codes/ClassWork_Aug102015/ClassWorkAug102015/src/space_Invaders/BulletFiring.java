package space_Invaders;

import java.awt.Rectangle;

public class BulletFiring extends Thread {
	
	private GameBoard gameboard;
	private Ghost[] ghosts;
	private Bullet bullet;
	
	public BulletFiring(GameBoard gameboard, Ghost[] ghosts, Bullet bullet) {
		
		this.gameboard = gameboard;
		this.ghosts = ghosts;
		this.bullet = bullet;
	}
	
	public void run(){
		
		while(bullet.getY() > 0){
			
			bullet.setY(bullet.getY() - 1);
			checkCollision();
			try {
				Thread.sleep(10);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
			
			}
			
			
			gameboard.repaint();
		}
		
		bullet.setY(-50);
		
	}
	
	public void checkCollision(){
		
		Rectangle bulletRect = new Rectangle(bullet.getX(),bullet.getY(),8,8);
		
		for(int i = 0; i < ghosts.length; i++){
			
			Rectangle ghostRect = new Rectangle(ghosts[i].getX(),ghosts[i].getY(),32,32);
			
			if(bulletRect.intersects(ghostRect) == true)
			{
				ghosts[i].setAlive(false);
				bullet.setX(-50);
				GameSound.bulletHitSound();
			}	
			
			
		}
		
		
		
	}
	
	
	
	

}
