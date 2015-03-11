package inferno.enemies;

import inferno.Character;

public class Enemy extends Character {
	private boolean PlayerSpotted;
	public void step() {  //algorithm that selects movement and attacks
		
	}

	public Enemy() {
	}

	public boolean isPlayerSpotted() {
		return PlayerSpotted;
	}

	public void setPlayerSpotted(boolean playerSpotted) {
		PlayerSpotted = playerSpotted;
	}

}
