package LambdaExpression;

interface SomeFunc<T extends Comparable <T>>{
	T func(T t);
}

public class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {
		SomeFunc <String>ob = (t) ->{
			String result = "";
			for(int i=t.length()-1;i>=0;i--) {
				result += t.charAt(i);
			}
			return result;
		};
		System.out.println(ob.func("Hein"));
		
		SomeFunc <Integer>ob2 = (num) ->{
			int result = 1;
			for(int i=1; i<=num;i++) {
				result *=i;
			}
			return result;
		};
		System.out.println(ob2.func(5));
	}
}
