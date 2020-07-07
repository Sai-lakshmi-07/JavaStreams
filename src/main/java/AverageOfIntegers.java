import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
import java.lang.*;
public class AverageOfIntegers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfNmbrs,avgOfNmbrs;
		ArrayList<Integer> intgrs=new ArrayList<Integer>();
		System.out.print("Enter No. of Elements:");
		noOfNmbrs=sc.nextInt();
		System.out.println("Enter elements");
		for(int iter=1;iter<=noOfNmbrs;iter++)
		{
			intgrs.add(sc.nextInt());
		}
		avgOfNmbrs=avgOfLstOfIntegers(intgrs,( a, b)->a+b);
		System.out.println("Average of Given Integers : "+avgOfNmbrs);
	}
	public static int avgOfLstOfIntegers(ArrayList<Integer> nmbrs,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int s=0,avg;
		BiFunction<Integer,Integer,Integer> findDivision=(a,b)->a/b;
		for(int num:nmbrs)
		{
			s=biFunction.apply(s,num);
		}
		avg=findDivision.apply(s,nmbrs.size());
		return avg;
	}
}