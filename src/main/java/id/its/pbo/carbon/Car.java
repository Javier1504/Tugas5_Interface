package id.its.pbo.carbon;

public class Car implements CarbonFootprint{
	//attributes
	private double fuelOil;
	
	//Constractor
	public Car(double fuelOil){
		this.fuelOil = fuelOil;
	}
	
	public double getFuelOil() {
		return fuelOil;
	}

	public void setFuelOil(double fuelOil) {
		this.fuelOil = fuelOil;
	}

	//Method
	public double getCarbonFootprint() {
		return CarbonFootprint.EMMISION * fuelOil;
	}
}
