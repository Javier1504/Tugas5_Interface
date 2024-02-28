package id.its.pbo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import id.its.pbo.carbon.Bicycle;
import id.its.pbo.carbon.Buildings;
import id.its.pbo.carbon.Car;
import id.its.pbo.carbon.CarbonFootprint;

class CarbonFootprintTest {
	CarbonFootprint car;
	CarbonFootprint bicycle;
	CarbonFootprint buildings;

	@BeforeEach
	void setUp() throws Exception {
		car = new Car(156.5);
		bicycle = new Bicycle(140.25);
		buildings = new Buildings(119.48, 120, 135.4, 16.4);
	}

	@Test
	@DisplayName("Mendapatkan nilai carbon footprint dari Car")
	void testCar() {
		assertEquals(27277.95, car.getCarbonFootprint());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai carbon footprint dari Bicycle")
	void testBicycle( ) {
		assertEquals(701.25, bicycle.getCarbonFootprint());
	}
	
	@Test
	@DisplayName("Mendapatkan nilai carbon footprint dari Buildings")
	void testBuildings( ) {
		assertEquals(1324.896, buildings.getCarbonFootprint());
	}
}
