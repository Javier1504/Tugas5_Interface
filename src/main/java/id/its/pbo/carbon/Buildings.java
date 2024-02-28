package id.its.pbo.carbon;

public class Buildings implements CarbonFootprint{
	//attributes
	private double electric;
	private int naturalGas;
	private double fuelOil;
	private double LPG;
	
	//Constractor
	public Buildings(double electric, int naturalGas, double fuelOil, double LPG){
		this.electric = electric;
		this.naturalGas = naturalGas;
		this.fuelOil = fuelOil;
		this.LPG = LPG;
	}

	
	//Method
	public double getElectric() {
		return electric;
	}


	public void setElectric(double electric) {
		this.electric = electric;
	}


	public int getNaturalGas() {
		return naturalGas;
	}


	public void setNaturalGas(int naturalGas) {
		this.naturalGas = naturalGas;
	}


	public double getFuelOil() {
		return fuelOil;
	}


	public void setFuelOil(double fuelOil) {
		this.fuelOil = fuelOil;
	}


	public double getLPG() {
		return LPG;
	}


	public void setLPG(double LPG) {
		this.LPG = LPG;
	}

	public double getCarbonFootprint() {
		return (CarbonFootprint.ELECTRICITY_EF * getElectric()) +
				(CarbonFootprint.NATURAL_GAS_EF * getNaturalGas()) +
				(CarbonFootprint.FUEL_OIL_EF *getFuelOil())+
				(CarbonFootprint.LPG_EF * getLPG());
	}
}
