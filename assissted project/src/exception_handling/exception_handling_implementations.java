package exception_handling;
import java.util.Scanner;
class SalaryException extends Exception{	
	private static final long serialVersionUID = 1L;
	SalaryException(String s)
	{
		super(s);
	}
}
public class exception_handling_implementations {
	void performance(int a) throws SalaryException
	{
		if(a<2100)
		{
			throw new SalaryException("you need to work hard");
		}
		else if(a>2100 && a<5000)
		{
			throw new SalaryException("your salary is somehow good");
		}
		else if(a>5100 && a<9000)
		{
			throw new SalaryException("salary is vry good");
		}
	}
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		int a=sc.nextInt();
		exception_handling_implementations s=new exception_handling_implementations();
		try
		{
			s.performance(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
