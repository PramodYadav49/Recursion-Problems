package recursive;

import java.util.Scanner;

public class NumberPower {
	static int power(int n,int pow){
		
		if(pow==1) {
			return n;
		}
		
		
		int x=power(n,pow-1);
		return n*x;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		System.out.println("Enter power");
		int pow=sc.nextInt();
		System.out.println("Result : "+power(n,pow));
	}

}
