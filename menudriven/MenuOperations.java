class MenuOperations
{
	
	public static int freQuency(int [][]arr ,int x)
	{  
	  int count = 0 ;
	
		for (int i = 0;i< arr.length;i++)
		{
			for(int j= 0;j<arr[i].length;j++)
			{
				if(arr[i][j] == x)
				{
					count = count + 1;
				}
			}
		}
		
		return count;
	}
	
	
	public static int min(int [][] arr)
	{
		int min1 = Integer.MAX_VALUE ;
		for(int i =0;i<arr.length ; i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if (arr[i][j]<min1)
				{
					min1 = arr[i][j];
				}
			}
		}
		
		return min1;
		
	}
	
	
	
	public static int max(int [][] arr)
	{
		int max1 = Integer.MIN_VALUE ;
		for(int i =0;i<arr.length ; i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if (arr[i][j]>max1)
				{
					max1 = arr[i][j];
				}
			}
		}
		
		return max1;
		
	}
	
	
	public static void transpose (int [][] arr)
	{
		
		int temp;
		for (int i=0;i<arr.length;i++)
		{
			for(int j = i+1; j<arr[i].length;j++)
			{
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				
			}
		}
		
		
			for (int i=0;i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println("");
		}
	}
	
	
}