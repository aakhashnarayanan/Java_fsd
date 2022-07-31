package exception;
import java.io.IOException;
import java.util.Scanner;
public class exception_iplementation {
	void display(int l,int b) throws IOException
    {
    	if(l>b)
    	{
    		throw new IOException();
    	}
    	else
    	{
    		System.out.println("Area of the Rectangle= " + (l*b));
    	}
    }
    void  n(int a,int b)
    {
    	try
    	{
    	    display(a,b);
    	}
    	catch(Exception e)
    	{
    		System.out.println("IO_Exception");
    	}
    	finally
    	{
    		System.out.println("Always called");
    	}
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of Rectangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		exception_iplementation obj=new exception_iplementation();
		obj.n(a, b);
		sc.close();
	}
}
