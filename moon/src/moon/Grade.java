package moon;

public class Grade {
	public static void main(String[] args) {
		aveGrade(98,94,57,88,99);
		
	}
	public static void aveGrade (int a, int b, int c, int d, int e) { //repeat
		double average = (a+b+c+d+e)/5;
		if (average>90)
		{
			System.out.println("Grade is A");
		}
		else if(average>80)
		{
			System.out.println("Grade is B");
		}
		else if(average>70)
		{
			System.out.println("Grade is C");
		}
		else {
			System.out.println("Grade is F");
		} 
	}

}
