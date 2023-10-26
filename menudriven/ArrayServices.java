import java.util.*;

class ArrayServices {
	
	public static void acceptData(int [] arr)
	{
		Scanner sc =  new Scanner(System.in);
		 System.out.println("Enter data of array");
		for (int i =0;i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
	}
	
	public static void displayData(int [] arr)
	{
		System.out.println("Array Data\n");
		for (int i =0;i<arr.length ; i++)
		{
			 System.out.println(arr[i]);
		}
	}
	
	public static void acceptData2D(int [][] arr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data of array");
		 
		for(int i =0;i<arr.length ;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
	}
	
	public static void displayData2D(int [][] arr)
	{    System.out.println( "  Display data"); 
		for(int i =0;i<arr.length ;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" \n");
		}
		
	}
	
}