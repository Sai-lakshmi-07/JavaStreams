import java.util.function.Predicate;
import java.util.stream.*;
import java.lang.*;
import java.util.*;
public class StringsOfLength3StartsWithA
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfStrings,i;
		List<String> Strings=new ArrayList<String>();
		System.out.print("Enter no of Strings : ");
		noOfStrings=sc.nextInt();
		System.out.println("Enter Strings");
		for(i=1;i<=noOfStrings;i++)
		{
			Strings.add(sc.next());
		}
		Predicate<String> predicate = (str)->str.length()==3 && str.startsWith("a");
		List<String> res;
		res=Strings.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(res);
	}
}