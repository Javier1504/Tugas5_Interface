package id.its.pbo.carbon;

public interface CarbonFootprint {
	
	//Bicycle
	public final double EMMISSION = 5.0; // g / km;

	//Building
	public final double ELECTRICITY_EF = 0.7;
	public final double NATURAL_GAS_EF = 6.6;
	public final double FUEL_OIL_EF = 3.1;
	public final double LPG_EF = 1.8;
	
	//Car
	public final double EMMISION = 174.3; // g/km
	 
	//method
	double getCarbonFootprint();
}
