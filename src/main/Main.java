package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 10;
		int Search ;
		int[] arrInt = new int[n];
		
		Random rand = new Random();
		for(int i = 0 ;i<n;i++)
		{
			arrInt[i] = rand.nextInt(100);
			//arrInt[i] = i;
			while (arrInt[i]== 0)
			{
				arrInt[i] = rand.nextInt(100);
			}
		}
		System.out.println("Tablica przed sortowaniem ");
		PrintArray(arrInt);
		bubbleSort(arrInt,n);
		System.out.println("\nTablica po sortowaniem ");
		PrintArray(arrInt);
		do {
			System.out.println("Czego szukasz, 0-> koniec: ");
			Search = scan.nextInt();
			BinarySearch(arrInt,Search,n);
//		for ( int i =0 ;i<10;i++)
//		{
//			BinarySearch(arrInt,i,n);
//		}

		}while (Search!=0);
		System.out.println("Czego szukasz, 0-> koniec: ");

	}
	public static void PrintArray(int[] arrayInt)
	{
		
		
		for ( int i = 0 ;i<arrayInt.length;i++)
		{
			System.out.print(arrayInt[i]+ " ");
			if(i%10==0 &&  i!= 0)
			{
				System.out.println("");
			}
		}
		System.out.println("");
	}
	
	public static void PrintArray(int[] arrayInt,int n)//this method is used to test array 
	{
//		for ( int i = 0 ;i<10;i++)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println("");
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
		System.out.println(Search + " " + n);
		int i = 0;
		int tmp = n;
		i = (n/2)-1;
		tmp = tmp/2;
		int wybrana  ;
		wybrana =arrayInt[i];
		//PrintArray(arrayInt,i);
		Boolean koniec= true;
		do {
		
			if (wybrana>Search)
			{
				tmp = tmp/2;
				i = i/2;
			//	PrintArray(arrayInt,i);
				wybrana =arrayInt[i];
			//	System.out.println(Search+ " "+wybrana + " " + i + " " +n+ " "+ tmp);
				
			}
			else if (wybrana<Search)
			{
				tmp = tmp /2 ;
				if (tmp == 0 )
				{
					tmp = 1;
				}
				i = (i + tmp);				
//				PrintArray(arrayInt,i);
				wybrana =arrayInt[i];
//				System.out.println(Search+ " "+wybrana + " " + i + " " +n + " "+ tmp);		
			}
			if (wybrana==Search)
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
			else if ( i < 0)
			{
				System.out.println("lose");
				koniec = false;
			}
			
			//System.out.println(wybrana + " " + i);
			

		}while(koniec);
	}
}
