package recursive;

import java.util.HashMap;

public class freqChar {
	static HashMap<Character,Integer> freq(String s,int length,int l,HashMap<Character, Integer>map) {	
		if(length==0) {
			return map;
		}
		char singleChar =s.charAt(l);
		if(map.get(singleChar)==null) {
			map.put(singleChar, 1);
		}else {
			int count=map.get(singleChar);
			map.put(singleChar, count+1);
		}
		return freq(s, length-1,l+1, map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ram kumar";
		HashMap<Character, Integer> map= new HashMap<>();
		System.out.println(freq(s,s.length()-1,0,map));
	}

}
