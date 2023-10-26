import java.util.*;


class Menu{

public static void main(String [] args )
{
	//frequency of no in 2d array;
	int [][] arr = new int [3][3];
	 Scanner sc = new Scanner(System.in);
	
	 ArrayServices.acceptData2D(arr);
	 ArrayServices.displayData2D(arr);
	  System.out.println("enetr no ");
	 int x =  sc.nextInt();
	 int ans = MenuOperations.freQuency( arr, x);
	 System.out.println("count of - " + (x) + " is " + (ans));
	
}
	
}