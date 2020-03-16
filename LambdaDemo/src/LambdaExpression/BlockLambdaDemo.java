package LambdaExpression;

interface NumericFunc{
	int func(int n);
}

public class BlockLambdaDemo {
	public static void main(String[] args) {
		NumericFunc nf;
		nf = (int n)->{
			int result = 1;
			for(int i=1;i<=n;i++) {
				result *= i;
			}
			return result;
		};
		
		System.out.println("5! " + nf.func(5));
	}
}
