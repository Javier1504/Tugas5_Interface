package id.its.pbo.carbon;

public class Bicycle implements CarbonFootprint{
	//attributes
	private double g;
	
	//Constractor
	public Bicycle(double g){
		this.g = g;
	}
	
	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	//Method
	public double getCarbonFootprint() {
		return CarbonFootprint.EMMISSION * g;
	}
}
