package map;
import java.util.*;
public class Map_implementation {
public static void main(String[] args) {	
		int n,a,i;
		String s;
		Scanner sc=new Scanner(System.in);	
		//Hash Map
		Map<Integer,String> HM=new HashMap<>();
		System.out.println("Enter no. of strings to be added");
		n=sc.nextInt();
		System.out.println("Enter " + n + " key value and String content");
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			s=sc.next();
			HM.put(a,s);
		}
		System.out.println(HM);	
		//Tree Map
		Map<Integer,String> TM=new TreeMap<>();
		System.out.println("Enter no. of strings to be added");
		n=sc.nextInt();
		System.out.println("Enter " + n + " key value and String content");
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			s=sc.next();
			TM.put(a,s);
		}
		System.out.println(TM);
		sc.close();
	}
}
