import java.util.*;
class Min{
	
public static void main(String [] args)
{
	int [][] arr = new int [3][3];
	 Scanner sc = new Scanner(System.in);
	
	 ArrayServices.acceptData2D(arr);
	 ArrayServices.displayData2D(arr);
	 
	  int ans = MenuOperations.min( arr);
	 System.out.println("Min of matrix - " + " is " + (ans));
	 
	
	
	
}
	
}