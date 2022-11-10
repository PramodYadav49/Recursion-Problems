package recursive;

import java.util.Scanner;

public class StringReverse {
	static void Reverse(String s,String n,int length) {
		if(length==0) {
			n+=s.charAt(0);
			System.out.println(n);
			return;
		}
		n+=s.charAt(length);
		Reverse(s,n,length-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		Reverse(s,"",s.length()-1);

	}

}
