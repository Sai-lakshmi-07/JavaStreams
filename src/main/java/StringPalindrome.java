import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.lang.*;
public class StringPalindrome
{
	public static boolean checkPalindrome(String input)
	{
		return input.equalsIgnoreCase(new StringBuilder().append(input).reverse().toString());
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<String> strngs = new ArrayList<String>();
		int noOfStrings;List<String> res;
		System.out.print("Enter no of Strings : ");
		noOfStrings = sc.nextInt();
		System.out.println("Enter Strings");
		for(int i=1;i<=noOfStrings;i++) {
			strngs.add(sc.next());
		}
		Predicate<String> predicate=StringPalindrome::checkPalindrome;      //(s)->s.equalsIgnoreCase
		res=strngs.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(res);
	}
}