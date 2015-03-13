package inferno.enemies;

import inferno.World;

public class Imp extends Enemy {
	@Override
	public boolean inRange(){
		if(getWorld().getPlayer().getPosX()-getPosX()<=1&&getWorld().getPlayer().getPosY()-getPosY()<=1) return true;
		
		return false;
	}
	
	@Override
	public void checkPlayerSpotted(){
	}
	
	@Override
	public void step() {  //algorithm that selects movement and attacks
		if(isPlayerSpotted()){
			
			if(!inRange()){
				int playerX=getWorld().getPlayer().getPosX();
				int playerY=getWorld().getPlayer().getPosY();
				int disx=Math.abs(playerX-getPosX());
				int disy=Math.abs(-getPosY());
				int bestChangeX = 0;
				int bestChangeY=0;
				boolean xy=true; //false is y true is x
				
				if(playerY>getPosY()) bestChangeY=getPosY()+1;
				else bestChangeY=getPosY()-1;

				if(playerX>getPosX()) bestChangeX=getPosX()+1;
				else bestChangeX=getPosX()-1;

				if(disx<disy){
					xy=false;
				}
				World w=getWorld();
				
				if(xy){
					if(!w.WallAt(bestChangeX, getPosY()))setPosX(bestChangeX);
					else
						if(!w.WallAt(getPosX(), bestChangeY)) setPosY(bestChangeY);
						else{
							
						}
					
				}else{
					
				}
				
			}

			
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
