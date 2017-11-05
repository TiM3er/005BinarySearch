package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] arrInt = new int[10];
		
		Random rand = new Random();
		for(int i = 0 ;i<10;i++)
		{
			//arrInt[i] = rand.nextInt(10);
			arrInt[i] = i;
		}
		
		//PrintArray(arrInt);
		//bubbleSort(arrInt,10);
		//PrintArray(arrInt);
		BinarySearch(arrInt,4,10);
	}
	public static void PrintArray(int[] arrayInt)
	{
		for ( int i = 0 ;i<10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		for ( int i = 0 ;i<10;i++)
		{
			System.out.print(arrayInt[i]+ " ");
		}
		System.out.println("");
	}
	
	public static void PrintArray(int[] arrayInt,int n)
	{
		for ( int i = 0 ;i<10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
		for ( int i = 0 ;i<10;i++)
		{
			if (i==n)
			{
				
				System.out.print("["+arrayInt[i]+ "]");

			}
			else 
			{
				System.out.print(arrayInt[i]+ " ");

			}
		}
		System.out.println("");
	}

	public static void bubbleSort(int[] arrayInt,int n)
	{
		int temp= 0;
		 for(int i=0; i < n; i++){  
	        	for(int j=1; j < (n-i); j++){  
	        		
	        		if(arrayInt[j-1] > arrayInt[j]){  
	        			
	        			temp = arrayInt[j-1];  
	        			arrayInt[j-1] = arrayInt[j];  
	        			arrayInt[j] = temp;  
	        		}  
	        	}  
	     	} 
	}

	public static void BinarySearch(int[] arrayInt,int Search,int n)
	{
		
		int i = 0;
		i = (n/2)-1;
		int wybrana  =arrayInt[i];
		Boolean koniec= true;
		do {
			wybrana =arrayInt[i];
			if (wybrana>Search)
			{
				i = (i /2);
			}
			else if (wybrana<Search)
			{
				i = i+(i/2);
			}
			else if (wybrana==Search)
			{
				koniec = false;
				System.out.println("win");
			}
			if (i==0 )
			{
				if (arrayInt[i] == Search )
				{
					System.out.println("win");
				}
				else
				{
					System.out.println("lose");
				}
				koniec = false;
			}
			if (i > n)  
			{
				System.out.println("lose");
				koniec = false;
			}

		}while(koniec);
	}
}
