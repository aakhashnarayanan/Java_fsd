package reg_expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class exp1 {
	public static void main(String[] args)
{
Pattern n=Pattern.compile("aakhash_");
Matcher m=n.matcher("aakhash_a");
Boolean a=m.matches();
System.out.println(a);
Pattern p1=Pattern.compile("[A-Z]");
Matcher m1=p1.matcher("M");
Boolean a1=m1.matches();
System.out.println(a1);

} 

}
