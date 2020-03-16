package LambdaExpression;

interface Myfunc{
	int func(int n);
}

public class VarCapture {
	public static void main(String[] args) {
		int num = 10;
		
		Myfunc myLambda = (n) ->{
			int v = num  + n;
//			num ++;  // num become final variable in Lambda Expression scope
//			num = 9;
			int c = num + v;
			return c;
		};				
		
		System.out.println(myLambda.func(5));
	}
}
