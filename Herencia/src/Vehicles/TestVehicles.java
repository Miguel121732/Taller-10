package Vehicles;

public class TestVehicles {
	
	public static void main(String[] args) {
		
		System.out.println("Manufacturer: "+ Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " +Vehicle.numVehicle);
		
		Vehicle vehicle1 = new Vehicle("Vision");
		System.out.println(vehicle1);
		
		Vehicle vehicle2 = new Vehicle("Edit");
		System.out.println(vehicle2);
		
		vehicle2.setMake("Seer");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		
	
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println("Vehicle number "+vehicle3.getChassiNo()+" is a "+ vehicle3.getModel() + " model and has an engine of "+ vehicle3.getCAPACITY()+ "cc");


		System.out.println("Number of vehicles manufactured: " +Vehicle.numVehicle);

	}

}
