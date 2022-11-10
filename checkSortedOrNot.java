package recursive;

public class checkSortedOrNot {
	static boolean check(int []arr,int length,int max) {
	if(arr.length==length) {
		boolean a=arr[arr.length-1] > max;
		return a;
	}else
	if(arr[length]>=max) {
		max=arr[length];
	}else {
		return false;
	}
	boolean x=check(arr,length+1,max);
	return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {66, 366, 489, 2000, 10000};
		System.out.println(check(arr,arr.length-1,-21474836));

	}

}
