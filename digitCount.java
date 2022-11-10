package recursive;

public class digitCount {
	public static void main(String[] args) {
	System.out.println(countdigit(12345));
		
	}
	static int countdigit(int n) {
		
		
		if(n==0) {
			
			return 0;
		} 
		
		
		int count=countdigit(n/10);
		count+=1;
		return count;
		 
		 
		
		
		
		
		
	
		
		
	}

}
