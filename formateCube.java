package recursive;

import java.util.ArrayList;

public class formateCube {
	static ArrayList<Integer> cube(int arr[],ArrayList<Integer> list,int length) {
		if(length==arr.length-1) {
			System.out.println(arr[arr.length-1]);
		list.add((int)Math.pow(arr[arr.length-1],3));
		return list;
		}
		list.add((int)Math.pow(arr[length], 3));
		
		System.out.println(arr[length]);
		ArrayList<Integer> l=cube(arr,list,length+1);
		
		return l;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		int [] arr= {2,3,5,6,7};
		System.out.println(cube(arr,l,0));
	}

}
