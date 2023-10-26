import java.util.*;

public class DiamondPattern
{
	public static void displayPattern(int num)
	{    int k;
		int Spacecnt = (int) (num/2);
		for (int i=1; i<=num; i=i+2)
		{
			String s="";
			for(k=0; k < Spacecnt; k++)
			{
				s=s+"_";
				
			}
			String Star = "";
			for(int j=1; j<=i; j++)
			{
				Star=Star+"*";
			}
			System.out.println(s+Star);
			Spacecnt = Spacecnt-1;
			System.out.println();
		}
		Spacecnt=1;
		for(int i=num-2; i>+1; i=i-2)
		{
			String s="";
			for( k=0; k<Spacecnt; k++)
			{
				s=s+"_";
			}
			String star = "";
			for(int j=1; j<=i; j++)
			{
				star=star+"*";
			}
			System.out.println(s+star);
			System.out.println();
			Spacecnt=Spacecnt + 1;
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to display");
		int num=sc.nextInt();
		displayPattern(num);
		sc.close();
	}
	
}