package recursive;

import java.util.ArrayList;

public class permutationString {
	
	static ArrayList<String> printPermutation(String str, String permutation,ArrayList<String> arr) {
		
			if(str.length()==0) {
				
				arr.add(permutation);
				return arr;
			}
			
			for(int i=0;i<str.length();i++) {
				char curr=str.charAt(i);
				String Nstr=str.substring(0,i)+str.substring(i+1);
				printPermutation(Nstr, permutation+curr, arr);
			}
			return arr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		ArrayList<String> arr=new ArrayList<String>();
	System.out.println(printPermutation(s, "", arr));

	}

}
