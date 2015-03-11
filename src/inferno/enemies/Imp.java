package inferno.enemies;

public class Imp extends Enemy {
	
	@Override
	public void checkPlayerSpotted(){
		
	}
	
	@Override
	public void step() {  //algorithm that selects movement and attacks
		if(isPlayerSpotted()){
			
			
			
		}else{
			//random movement, implement wall collision checking later
			int x=(int) (Math.random()*3);
			int y=(int) (Math.random()*3);
			if(Math.random()<.5)x*=-1;
			if(Math.random()<.5)y*=-1;
			
			setPosX(x+getPosX());
			setPosY(y+getPosY());
			
			checkPlayerSpotted();
			
		}
		
		
		
	}
	
	
	
}
