package week2.day1;

public class Car {
	public void driverCar(String name)
	{
		System.out.println(name);
		System.out.println("started car");
	}
	 private void applyBrake()
	 {
		 System.out.println("apply break");
	 }
	 protected void soundHorn() {
		 System.out.println("blow horn");
		 
	 }
	 
	 boolean isPunture(boolean var)
	 {
		 System.out.println(var);
		 return var;
	 }

	public static void main(String[] args) {
		Car car =new Car();
		car.driverCar("driver name is xyz and");
		car.applyBrake();
		car.soundHorn();
		car.isPunture(false);
		// TODO Auto-generated method stub
		/*
		 * Create a class by name : Car
	b)Create a method 
	  driveCar->Have a print statement
	  applyBrake->Have a print statement
	  soundHorn->Have a print statement
	  isPuncture->Have a print statement
	c)Create a main method 
	d)Create an Object
	e)Call the methods using the object
	f)Run and Confirm
		 */

	}

}
