package LambdaExpression;

import java.util.function.*;

public class UseFunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> f = (n) ->{ // use the Function built_in functional interface
			int result = 1;
			for(int i=1;i<=n;i++) {
				result *=i;
			}
			return result;
		};
		
		System.out.println("5! = " + f.apply(5));
	}
}
