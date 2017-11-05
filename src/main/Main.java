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
			//arrInt[i] = rand.nextInt(100);
			arrInt[i] = i;
//			while (arrInt[i]== 0)
//			{
//				arrInt[i] = rand.nextInt(100);
//			}
		}
		System.out.println("Tablica przed sortowaniem ");
		PrintArray(arrInt);
		bubbleSort(arrInt,n);
		System.out.println("\nTablica po sortowaniem ");
		PrintArray(arrInt);
		//do {
		//	System.out.println("Czego szukasz, 0-> koniec: ");
		//	Search = scan.nextInt();
			BinarySearch(arrInt,7,n);

		//}while (Search!=0);
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
		n=n/2;
		i = --n;
		int wybrana  ;
		wybrana =arrayInt[i];
		Boolean koniec= true;
		do {
		
			if (wybrana>Search)
			{
				n=n/2;
				i =i- n-1;
				PrintArray(arrayInt,i);
				System.out.println(wybrana + " " + i);
				
			}
			else if (wybrana<Search)
			{
				n=n/2;
				i = i+n+1;
				PrintArray(arrayInt,i);
				System.out.println(wybrana + " " + i);
				
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
			else if (i < n)  
			{
				System.out.println("lose");
				koniec = false;
			}
			else 
			{
				wybrana =arrayInt[i];
			}
			System.out.println(wybrana + " " + i);
			

		}while(koniec);
	}
}
