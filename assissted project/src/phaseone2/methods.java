package phaseone2;

public class methods {
	public int calculate(int a,int b)
	{
		return a+b;
	}
	public int calculate(int a)
	{
		int c = (22/7)*(a*a);
		return c;
	}
	public int calculate(double a,double b)
	{
		int c = (int) (a*b);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods cc=new methods();
		int a=cc.calculate(5,6);
		int b=cc.calculate(4);
		int c=cc.calculate(3.4,4);		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
