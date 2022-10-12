package pacman;

import javax.swing.*;

import java.awt.*;

public class Ghost {
	
		private int x,y;
		private String imagePath;
		private boolean isAlive;
		
		
		public boolean getIsAlive() {
			return isAlive;
		}

		public void setAlive(boolean isAlive) {
			this.isAlive = isAlive;
		}

		public Ghost(int x, int y, String imagePath) {
			
			this.x = x;
			this.y = y;
			this.imagePath = imagePath;
			isAlive = true;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public String getImagePath() {
			return imagePath;
		}

		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
	
		public void draw(Graphics g){
			
			ImageIcon icon = new ImageIcon(imagePath);
			Image ghost = icon.getImage();
			g.drawImage(ghost,x,y, null);
			
		}

}
