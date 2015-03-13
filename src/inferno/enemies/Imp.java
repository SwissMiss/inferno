package inferno.enemies;

public class Imp extends Enemy {
	
	@Override
	public void checkPlayerSpotted(){
		int playerX=getWorld().getPlayer().getPosX();
		int playerY=getWorld().getPlayer().getPosY();
		int disx=Math.abs(playerX-getPosX());
		int disy=Math.abs(-getPosY());
		int bestChange;
		if(disx<disy){
			if(playerY>getPosY());
		}
		
	}
	
	@Override
	public void step() {  //algorithm that selects movement and attacks
		if(isPlayerSpotted()){
			
			
			
		}else{
			//random movement, implement wall collision checking later
			int x=(int) (Math.random()*2);
			int y=(int) (Math.random()*2);
			if(Math.random()<.5)x*=-1;
			if(Math.random()<.5)y*=-1;
			
			setPosX(x+getPosX());
			setPosY(y+getPosY());
			checkPlayerSpotted();
			
		}
		
		
		
	}
	
	
	
}
