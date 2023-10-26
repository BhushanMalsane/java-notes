import java.util.*;
class Max1{
	
public static void main(String [] args)
{
	int [][] arr = new int [3][3];
	 Scanner sc = new Scanner(System.in);
	
	 ArrayServices.acceptData2D(arr);
	 ArrayServices.displayData2D(arr);
	 
	  int ans = MenuOperations.max(arr);
	 System.out.println("Max of matrix - " + " is " + (ans));
	 
	
	
	
}
	
}