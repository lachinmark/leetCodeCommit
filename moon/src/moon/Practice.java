package moon;

public class Practice {
	public static void main(String[] args) {
		int z = 23;
		int x = 10;
		plexor(z,x);
		pol(z,x);
		poolrof();
		System.out.println(plexor(z,x));
	}
	public static int plexor(int d, int f) {
		int root = d*f;
		return root;
	}
	public static void pol(int k, int l) {
		double d = Math.sqrt(k);
		double c = Math.sqrt(l);
		System.out.println(d + " is a square root of " + k); 
		System.out.println(c + " is a square root of " + l);
	}
	public static void poolrof() {
		for (int i=1;i<12;i++)
		System.out.println(i);
	}
}
