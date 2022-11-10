package recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class checkPrime {
	static void prime(int n,int i,boolean p) {
		if(i>(int)Math.sqrt(n)) {
			System.out.println("Is Prime "+p);
			return;
		}
		else if(n>2 && n%2==0) {
			
			p=false;
			System.out.println("Is prime " +p);
			return;
		}
		else if(i<=(int)Math.sqrt(n)) {
			if(n%i==0) {
				p=false;
				System.out.println("Is prime "+p);
				return;
			}
			i=i+2;
			prime(n,i,p);
			
		}
	}
	static ArrayList<Integer> cp(int range,ArrayList<Integer> arr){
		if(range==2) {
			arr.add(1);
			return arr;
		}
		boolean result=pprime1(range,range-1);
		if(result==true) {
			arr.add(range);
		}
		ArrayList<Integer> arr2 =cp(range-1,arr);
		return arr2;
		
	}

	static boolean pprime1(int org, int small) {
		
		if(small== 1) {
			
			return true;
			
		}if(org%small==0) {
			
			return false;
		}
		return pprime1(org, small-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		prime(n,3,true);
//		pprime1(n, n-1);
		ArrayList<Integer> arr2 =new ArrayList<Integer>();
		ArrayList<Integer> arr=cp(n,arr2);
		
		System.out.println(arr);
		
		

	}

}
