package moon;

public class AveRepeat {

	public static void main(String[] args) {
		
		averageHeight(20,165,17,185,173,191,16);

	}
	
	public static void averageHeight(int a,int b,int c,int d, int e, int f, int g) {
		double x=(a+b+c+d+e+f+g)/7;
		if (x>190)
		{
			System.out.println("They can be a basketball team");
		}
		else if (x>170)
		{
			System.out.println("They can be a football team");
		}
		else 
		{
			System.out.println("They can be just friends");
		}
	}

}
