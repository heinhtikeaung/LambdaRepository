package LambdaExpression;

interface NumericTest{
	boolean test(int n);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n%2)==0;
		
		System.out.println(isEven.test(10)); //Even
		System.out.println(isEven.test(11)); //Odd
		
		NumericTest NP = (n) -> (n>0);
		
		System.out.println(NP.test(5)); //Positive
		System.out.println(NP.test(-5)); //Negative
	}
}
