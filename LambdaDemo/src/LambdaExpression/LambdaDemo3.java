package LambdaExpression;

interface NumberTest3{
	boolean test(int n, int d);
}

public class LambdaDemo3 {
	public static void main(String[] args) {
		NumberTest3 nt;
		nt = (int n,int d) -> (n%d)==0;
		
		if(nt.test(10, 2)){
			System.out.println("2 is factor of 10");
		}		
	}
}
