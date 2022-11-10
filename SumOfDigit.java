package recursive;

import java.util.Scanner;

public class SumOfDigit {
	static void digitSum(int n,int result) {
		if(n==0) {
			System.out.println(result);
			return;
		}
		result+=n%10;
		digitSum(n/10,result);
	
		
	}
	static int digitSum2(int n) {
		if(n==0) {
			return 0;
		}
		
		int x=digitSum2(n/10);
		return x+n%10;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		digitSum(n,0);
		System.out.println(digitSum2(n));

	}

}
