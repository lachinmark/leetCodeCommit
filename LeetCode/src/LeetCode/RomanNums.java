package LeetCode;

import java.util.HashMap;
	
	class RomanNums {
		public static void main(String[] args) {
			int x = romanToInt("MCMXCIV");
			System.out.println(x);
		}
	    public static int romanToInt(String s)
	    {
	        HashMap<Character,Integer>hm=new HashMap<>();//Integer is a class, different from int data type
	        hm.put('I',1);
	        hm.put('V',5);
	        hm.put('X',10);
	        hm.put('L',50);
	        hm.put('C',100);
	        hm.put('D',500);
	        hm.put('M',1000);
	        int ans=0;
	        char ch[]=s.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        {
	            if((i+1)!=ch.length&&hm.get(ch[i])<hm.get(ch[i+1]))
	            {
	                ans=ans+hm.get(ch[i+1])-hm.get(ch[i]);
	                i++;
	            }
	            else
	            {
	                ans=ans+hm.get(ch[i]);
	            }
	        }
	        return ans;
	    }
	}
