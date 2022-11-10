package recursive;

public class DigitPrint {
	static void digit(int n) {
		if(n==0) {
			return;
		}
		digit(n/10);
		System.out.println(n%10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digit(2345);

	}

}
