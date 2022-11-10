package recursive;

public class Factorial {
	static long factorialSolution(int n) {
		if(n==1) {
			return 1;
		}
		long x=factorialSolution(n-1);
		return (x*n);
		
		
	}
	static void factorialSolution2(int n,long result) {
		if(n==1) {
			System.out.println(result);
			return ;
		}
		result*=n;
		factorialSolution2(n-1, result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialSolution(15));
		factorialSolution2(15, 1);
	}

}
