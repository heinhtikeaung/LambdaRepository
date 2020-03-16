package LambdaExpression;

interface MyNumber{
	double print();
}

public class LambdaDemo {
	public static void main(String[] args) {
		 MyNumber m; //declare interface Reference 
		 
		 m = () -> 23.23;
		 System.out.println(m.print()); // (Lambda must be compatible with abstract method)
		 
		 m = () -> Math.random() * 100;
		 System.out.println(m.print());
		 
		 //m = () -> "323.23";
	}
}
