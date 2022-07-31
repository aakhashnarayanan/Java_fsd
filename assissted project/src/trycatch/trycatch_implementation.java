package trycatch;

public class trycatch_implementation {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a,b,c;
			a = 10;
			b = 0;
			try {
				c= a/b; 
				System.out.println("the value is ;"+c);
			}
			catch(ArithmeticException ae){
				System.out.println("Number cannot be divided by zero in valid operation");
				System.out.println(ae.getMessage());
			
			}
	        finally{
	        	c=a+b;
	        	System.out.println("Addition is:"+c);
	        	
	        }
		}


}
