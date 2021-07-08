package moon;

public class ConditionalStatement {
	public static void main(String[] args) {
		addition(50,50);
		
	}
	public static void addition(int x, int y) {
		int q = x + y;
		if(q>100)
		{
			System.out.println("Summary is more then one hundred");
		}
		else if(q==100)  //goes until condition is satisfied
		{
			System.out.println("Summary is a hundred");
		}
		else {
			System.out.println("Summary is less then hundred");
		}
		
	}

}
