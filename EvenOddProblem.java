package recursive;

public class EvenOddProblem {
	static void solution(int n,int count,int even, int odd) {
		if(n==0) {
			System.out.println(odd+" "+even);
			return ;
		} 
		count++;
		int x=n%10;
		if(count%2==0) {
			even+=x;
		}else {
			odd+=x;
		}
		solution(n/10,count,even,odd);
		
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(917533, 0,0,0);
		

	}

}
