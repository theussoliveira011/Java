
public class Player{


	private String name;
	static int height = 140;
	private double weight;
	private Mushroom mushroom;


	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}


	static double getHeight(){
		return height;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	}

	public double changeHeight(){
		if(mushroom.getEated()){
			return this.height + 40; 
		} else {
			return this.height = 140;
		}
	}



}
