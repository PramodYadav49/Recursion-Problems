package recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class armStorng {
	static ArrayList<Integer> storeArmstrong(int range,ArrayList<Integer> arr){
		if(range==0) {
			return null;
		}
		storeArmstrong(range-1, arr);
		int x=checkarmstrong(range, count(range));
		if(x==range) {
			arr.add(x);
		}
		return arr;
		
		
	}
	
	static int count(int n) {
		if(n==0) {
			return 0;
		}
		int x=count(n/10 );
		return x+1;
		
	}
	static int checkarmstrong(int n,int count) {
		if(n==0) {
			
			return 0;
			
		}
		int x=checkarmstrong(n/10, count);
		int y=n%10;
		int result=(int)Math.pow(y, count);
		return x+result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr=storeArmstrong(range,arr2 );
		System.out.println(arr);
		
	}

}
