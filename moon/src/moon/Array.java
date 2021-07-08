package moon;

public class Array {

	public static void main(String[] args) {
		//displayArray1();
		findMaxElement();
	

	}
	
	public static void displayArray() { //collection of similar data types
		int [] niether = new int[5]; //arrays store data from index 0// 'new' is allocating memory
		niether[0]=12;
		niether[1]=22;
		niether[2]=42;
		niether[3]=90;
		niether[4]=62;
		int sum=niether[0]+niether[1]+niether[2]+niether[3]+niether[4];
		System.out.println(sum);
	}
	public static void displayArray1() { //collection of similar data types
		int [] niether = new int[5]; //
		niether[0]=12;
		niether[1]=22;
		niether[2]=42;
		niether[3]=90;
		niether[4]=62;
		int sum=0;
		for (int x=0;x<niether.length;x++) {
			sum=sum+niether[x]; //starts from sum=0 and adding according to index
		}
		System.out.println(sum);
	}
	//application of array
	public static void findMaxElement() {
		int [] niether = new int[5]; //try looking for a char, and count how many times it appeared
	niether[0]=12;
	niether[1]=122;
	niether[2]=42;
	niether[3]=90;
	niether[4]=62;
	int num=niether[0];
	for (int x=0;x<niether.length;x++) {
		if (niether[x]>num) { //if false it will pass the next line
			num=niether[x];
		}
	}
	
	System.out.println(num);
	}

}
