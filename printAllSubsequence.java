package recursive;
import java.util.ArrayList;

public class printAllSubsequence {

	static ArrayList<String> temp=new ArrayList<String>();
	static ArrayList<String> printSub(String s,String output) {
		if(s.length()==0) {
			System.out.println(output);
			temp.add(output);
			return temp;
		}
		char c=s.charAt(0);
		String s1=s.substring(1);
		
		printSub(s1, output);
		printSub(s1,output+c);
		return temp;
		
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String s="abc"	;
	System.out.println(printSub(s, ""));
	
	}

	

}
