package inferno;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends Character {
	
	private BufferedImage sprite=null;
	private int speed=2;
	private boolean moving;
	
	public Player(){
		try {
			sprite=ImageIO.read(new File("imgs/sprites/player_forward_center.png"));
		} catch (IOException e) {
			System.out.println("Player sprite not found.");
		}	//end try/catch
	}
	
	public void draw(Graphics g) {
		g.drawImage(sprite, getPosX(), getPosY(), null);
	}	//end draw
	
	public void move(String dir) {
		setMoving(true);
		if (dir.equals("left")) {
			setPosX(getPosX()-speed);
		}	//end if
		else if (dir.equals("right")) {
			setPosX(getPosX()+speed);
		}
		else if (dir.equals("down")) {
			setPosY(getPosY()+speed);
		}
		else if (dir.equals("up")) {
			setPosY(getPosY()-speed);
		}
	}	//end move

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
}
