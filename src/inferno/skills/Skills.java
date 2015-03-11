package inferno.skills;

import inferno.Stats;


public class Skills {
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}




	private String description;
	
	
	public void effect(Stats user,Stats target){
	}
	
	public String getDescrip(){return description;}
	public void setDescrip(String description){this.description=description;}

	

	
	public Skills(){
		
	}
}
