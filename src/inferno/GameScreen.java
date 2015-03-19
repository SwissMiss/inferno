package inferno;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GameScreen extends Canvas {

private BufferedImage[] tiles=new BufferedImage[9];
private BufferedImage playerSprite=null;
private BufferedImage enemySprite=null;
private BufferedImage itemSprite=null;
	
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setSize(512,416);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.add(new GameScreen());
		jf.setVisible(true);
	}	//end main
	
	public GameScreen() {
		super();
		try {
			tiles[0]=ImageIO.read(new File("imgs/tiles/browntile_BL.png"));
			tiles[1]=ImageIO.read(new File("imgs/tiles/browntile_B.png"));
			tiles[2]=ImageIO.read(new File("imgs/tiles/browntile_BR.png"));
			tiles[3]=ImageIO.read(new File("imgs/tiles/browntile_L.png"));
			tiles[4]=ImageIO.read(new File("imgs/tiles/browntile_C.png"));
			tiles[5]=ImageIO.read(new File("imgs/tiles/browntile_R.png"));
			tiles[6]=ImageIO.read(new File("imgs/tiles/browntile_TL.png"));
			tiles[7]=ImageIO.read(new File("imgs/tiles/browntile_T.png"));
			tiles[8]=ImageIO.read(new File("imgs/tiles/browntile_TR.png"));
			playerSprite=ImageIO.read(new File("imgs/sprites/player_forward_center.png"));
			enemySprite=ImageIO.read(new File("imgs/sprites/enemysprite.png"));
			itemSprite=ImageIO.read(new File("imgs/sprites/potionsprite.png"));
		} catch(IOException e) {
			System.out.println("Image(s) not found.");
		}	//end try/catch
	}	//end constructor
	
	public void paint(Graphics g) {
		Scanner sc=null;
		try {
			sc=new Scanner(new FileReader(new File("maps/terrainmap.txt")));
		} catch (FileNotFoundException e) {
			System.out.println(".txt file not found.");
		}	//end try/catch
		
		int ht=0;
		while(sc.hasNext()) {
			String line=sc.nextLine();
			for (int i=0;i<line.length();i++) {
				g.drawImage(tiles[Integer.parseInt(line.charAt(i)+"")-1], i*32, ht, null);
			}	//end for loop
			ht+=32;
		}	//end while loop
	}	//end paint
	
}	//end GameScreen
