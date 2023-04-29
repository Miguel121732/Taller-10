package Vehicles;

public class Vehicle {
	
	public static String MAKE = "Augur";
	public static int numVehicle = 0;
	
	private String ChassisNo;
	private String Model;
	
	public Vehicle (String Model) {
		numVehicle++;
		ChassisNo = "ch" + numVehicle;
		this.Model = Model;
		
		System.out.println("\nVehicle manufactured");
		
	}
	
	public static class Engine extends Vehicle {
		
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String Model) {
			super(Model);
		}
		
		public static String getMAKE() {
			return MAKE;
		}
		
		public static int getCAPACITY() {
			return CAPACITY;
		}
	}
	
	public void setMake(String mak) {
		this.MAKE = mak;
	}
	
	
	public String getChassiNo() {
		return ChassisNo;
	}
	
	public void setChassiNo(String ChassisNo) {
		this.ChassisNo = ChassisNo;
	}
	
	public String getModel() {
		return Model;
	}
	
	public void setModel(String Model) {
		this.Model = Model;
	}
	
	public String toString() {
		return "The vehicle is manufactured by: "+ Vehicle.MAKE
				+ "\nThe model type is: "+this.Model + "\nThe chassis number is: "+ChassisNo
	            + "\nThe engine make is: "+Engine.getMAKE()
	            + "\nThe engine capacity is: "+Engine.getCAPACITY()+ "cc";
	}
	

}
