package oops;


public class Executer {
	public static void main (String [] args) {
		Car audi = new Car("Hyundai","White", 7);//every object has its own memory
		Car audi1 = new Car("Hyundai","White", 7);
		//"new" is responsible of creating memory - find out about "new"=============
		//audi.setCarName("kName");
		String Name=audi.getCarName();
		//System.out.println(Name);
		//audi.setColor("purple");
		String Col = audi.getColor();
		//System.out.println(Col);
		//audi.setNumWheels(6);
		int y = audi.getNumWheels();
		//System.out.println(y);
		audi.display1();//to call method from other class we need to call object from that class
		audi.display2();
	Car bmw = new Car("Mercedes","Yellow", 8);
	//bmw.setCarName("740i");
	String Name1 = bmw.getCarName();
	//bmw.setColor("Green");
	String Col1 = bmw.getColor();
	//bmw.setNumWheels(4);
	int z = bmw.getNumWheels();
	bmw.display1();
	bmw.display2();
	System.out.println(Name1 + "    " + Col1 + "     " + z);
	System.out.println(Name +" "+ Col+" " + y);
	}
	//executed as part RAM only
	//stack and heap, temporary is going to stack
	//all permanent got to heap
	//garbage collector, no control, in JVM=============
	
	
}
