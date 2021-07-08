package oops;

public class Car {
	private String carName; //private is used only in this class
	private String color;
	private int numWheels;
	//getters and setters are used for getting and setting private properties
	public String getCarName(){
		return carName;
	}
	public void setCarName(String abc) { //setters always void // abc is variable that will be set from the place where we called it
		carName = abc;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String cde) {
		color = cde;
	}
	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int x) {
		numWheels = x;
	}
	//Constructors is specific type of method, no returns from this type of methods, 
	//constr's used only for initializations
	//constr's signature will be "public constrname"
	//constr name always should be the same as class name
	
	public Car(String carName,String carColor, int numberWheels) {//if not written Java creates one by default
		this.carName = carName;//"this" is used to identify class parameter - needs to be elaborated
		this.color = carColor;
		numWheels = numberWheels;
	}
	public static void display1() {
		System.out.println("This is display1 message");
	}
	public static void display2() {
		System.out.println("This is display2 message");
	}
}
