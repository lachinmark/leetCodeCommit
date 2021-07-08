package oops;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashmapTest {

	public static void main(String[] args) {
		// hashmap is data stracture where we have to use key-value pair
		//capitals();
		//count();
		//countNums();
		countsym();
	}
	
		public static void zipCodes() {
		HashMap<Integer, String> smth = new HashMap<>(); //left is key, right is value
		smth.put(11235, "midtown");
		smth.put(10019, "midwood");
		smth.put(11235, "sheepsheadbay");
		smth.put(11242, "midside");
		System.out.println(smth.size());
		System.out.println(smth.get(11235));
		}
		
		public static void capitals() {
			HashMap<String, String> smth = new HashMap<>();
			smth.put("Moscow", "Russia");
			smth.put("Helsinki", "Sweden");
			smth.put("Washington", "USA");
			smth.put("Tokyo", "Japan");
			smth.put("Beijing", "China");
			Scanner country = new Scanner(System.in);
			System.out.println("Enter capital name: ");
			String CountryName = country.nextLine();
			String x = smth.get(CountryName);
			if (x==null) {//String can be compared with null using ==
				System.out.println("Doesnt exist in DB");
			}
			else {
				System.out.println(smth.get(CountryName));
			}
			
		}
		
		public static void count() {
			String x = "abcbcaaba"; 
			//output a = 2, b = 4, c = 2
			HashMap<Character, Integer> smg = new HashMap<>();
			for (int i = 0;i<x.length();i++) {
				char y = x.charAt(i);
				boolean z = smg.containsKey(y); //go over again
				if (z==false) {
					smg.put(y, 1);
				}
				else {
					int q = smg.get(y);
					smg.put(y, q+1);
				}
			}
			for (Map.Entry<Character, Integer> var: smg.entrySet()) {//entryset will return complete set of keys and values
				System.out.println(var.getKey()+"=" + var.getValue());
			}
		}
		
		
		public static void countNums() {
			String x = "1123410"; 
			HashMap<Character, Integer> numsmap = new HashMap<>();
			for (int i = 0;i<x.length();i++) {
				char y = x.charAt(i);
				boolean z = numsmap.containsKey(y);
				if (z==false) {
					numsmap.put(y, 1);
				}
				else {
					int q = numsmap.get(y);
					numsmap.put(y, q+1);
				}
			}
			for (Map.Entry<Character, Integer> var: numsmap.entrySet()) {
				System.out.println(var.getKey()+"=" + var.getValue());
			}
		}
		//////////////////////////////////////////////////////////////
		
		public static void countsym() {
			String str = ".,,,..%%^&)))**&^^";
			HashMap<Character, Integer> symMap = new HashMap<>();
			for (int i =0;i<str.length();i++) {
				char x = str.charAt(i);
				boolean y = symMap.containsKey(x);
				if (y==false) {
					symMap.put(x, 1);
				}
				else {
					int p = symMap.get(x);
					symMap.put(x, p+1);
				}
			}
			for (Map.Entry<Character, Integer> var: symMap.entrySet()) { //not clear - var? entrySet?
				System.out.println(var.getKey()+"=" + var.getValue());
			}
		}
}
