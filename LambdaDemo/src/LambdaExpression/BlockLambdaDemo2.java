package LambdaExpression;

interface StringFunc{
	String func(String n);
}

public class BlockLambdaDemo2 {
	public static void main(String[] args) {
		StringFunc sf;
		sf = (String str) ->{
			String result = "";
			for(int i=str.length()-1;i>=0;i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println(sf.func("Hein"));
	}
}
