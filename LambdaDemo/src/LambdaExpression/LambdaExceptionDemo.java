package LambdaExpression;

interface DoubleNumericArrayFunc{
	double func(double []n) throws EmptyArray; // throws must write because inside Lambda Expression has throw Statement
}

class EmptyArray extends Exception{
	EmptyArray(){
		super("Array Empty");
	}
}

public class LambdaExceptionDemo {
	public static void main(String[] args) throws EmptyArray {
		double []arr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		DoubleNumericArrayFunc ob = (num) ->{  //target context is double[], Thus num will be num[]
			double sum = 0;
			if(num.length == 0) {
				throw new EmptyArray();
			}
			
			for(int i=0;i<num.length;i++) {
				sum +=num[i];
			}
			return sum;
		};
		
		System.out.println(ob.func(arr));		
		System.out.println(ob.func(new double[0])); // 0 length Array means Empty Array
	}
}
