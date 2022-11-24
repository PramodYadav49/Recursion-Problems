package recursive;

public class ReplacePiToValue {
	static String ReplacePi(String s, int i,String res) {
		if(s.length()==i) {
			return res;
		}
		if(s.charAt(i)=='p' && s.charAt(i+1)=='i') {
			res+="3.14";
			i+=1;
		}else{
			res+=s.charAt(i);
			
		}
		String r=ReplacePi(s,i+1,res);
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReplacePi("a+b -pi+c-d",0,""));

	}

}
