package recursive;

public class TowerOfHanoi {
	static void towerOfHanoi(int n, String s,String h, String d) {
		if(n==1) {
			System.out.println("Transfer disk "+ n+ " "+s+" From "+ d);
			return;
		}
		towerOfHanoi(n-1, s, d, h);
			System.out.println("Transfer disk "+ n+ " "+s+" From "+ d);
		towerOfHanoi(n-1, h, s, d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(5, "s", "h", "d");
	}

}
