class Vehicle{
	public void startEngine(){
		System.out.println("the vehicle engine is starting");
	}
}

class Car extends Vehicle{
	@Override
	public void startEngine(){
		System.out.println("the car's engine is starting with a key ignition");
	}
}

class Motorcycle extends Vehicle{
	@Override
	public void startEngine(){
		System.out.println("the motor cycle is started with a kick start");
	}
}

public class MainVehicle{
	public static void main(String[] args){
		Vehicle myvehicle;
		myvehicle = new Car();
		myvehicle.startEngine();
		myvehicle = new Motorcycle();
		myvehicle.startEngine();
		System.out.println("direct object calls:");
		Car mycar = new Car();
		Motorcycle mymc = new Motorcycle();
		mycar.startEngine();
		mymc.startEngine();
	}
}