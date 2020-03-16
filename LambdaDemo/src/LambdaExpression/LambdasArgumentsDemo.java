package LambdaExpression;

interface LD{
	String func(String n);
}

public class LambdasArgumentsDemo {
	static String stringOp(LD ob, String s) { //the first parameter is functional interface
		return ob.func(s);
	}
	
	public static void main(String[] args) {
		String name = "Hein Htike Aung";
		//Lambda Expression passed functional interface
		String s = stringOp((str) -> str.toUpperCase(), name); //str may write any Text but not equal with name and s
		
		System.out.println(s);
		
		s = stringOp((str)->{
			String result = "";
			for(int i=0;i<str.length();i++) { 
				if(str.charAt(i) != ' ') {
					result +=str.charAt(i);
				}				
			}
			return result;
		},name);
		
		System.out.println(s);
		
		s = stringOp((str) ->{
			String result = "";
			for(int i=str.length()-1;i>=0;i--) { 
				result += str.charAt(i);
			}
			return result;
		}, name);
		
		System.out.println(s);
	}
}
