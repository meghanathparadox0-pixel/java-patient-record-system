package training;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays_Practice_Task {

	public static void main1(String[] args) { 
		Scanner scan = new Scanner(System.in);

		int i[] = new int[5];

		System.out.println(i.length);
		int sum = 0;


		for(int j = 0; j < i.length; j++) {	
			System.out.println("Enter your number " + (j + 1));
			i[j] = scan.nextInt();
			sum += i[j];

		} 	System.out.println("sum: " + sum);

		double avg = (double)sum/i.length; // this is called casting 
		System.out.println("Average: " + avg);

	}

	public static void main2(String[] args) {

		String a[] = new String[] {"chai", "coffee"};
		String b[] = new String[] {"milk", "water", "coke"};

		String c[] = new String[a.length + b.length]; 

		System.out.println(c.length);
		for (int d = 0; d < a.length; d++) {
			c[d] = a[d] ;
		}
		for (int e = 0; e < b.length; e++) {
			c[a.length + e] = b[e]; // Index Arithmetic
		}	
		for (int f = 0; f < c.length; f++) {
			System.out.println(c[f]);
		}
	}


	/*
	 * String[] a = {"chai","Coffee"}; String[] b= {"milk","Water","Coke"};
	 * 
	 * String[] c= new String[5];
	 * 
	 * c[0] = a[0]; c[1] = a[1]; c[2] = b[0]; c[3] = b[1]; c[4] = b[2];
	 * 
	 * int i = 0; while(i<c.length) { System.out.print(c[i]+ " "); i++; }
	 */
	public static void main4(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the 5 values for the array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" the 5 values for the array are");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int max=a[0];
		int maxIndex=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				maxIndex=i;
			}
		}
		System.out.println("the max value  is:"+max);
		System.out.println("this max value is found at the index: "+maxIndex);
	}

	public static void main5(String[] args) {
		int i ;
		int a[] = new int[] {9,5,1,2,6};
		System.out.println("The Array value is " + a.length);

		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int max = a[0];
		int maxIndex = 0;
		for (i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				maxIndex = i;}
		} System.out.println("The max value is: " + max);
		System.out.println("The max Value Index is: " + maxIndex);
	}

	public static void main6(String[] args) {
		int i;
		String a[] = new String[] {"coffee", "water", "chai", "diet coke"};
		System.out.println("the Arrya value is: "+ a.length);

		for (i = 0; i < a.length; i++) {
			System.out.println("Array data is " + a[i]);
		}
		int min = Integer.MAX_VALUE;
		int minIndex = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i].length() < min) {
				min = a[i].length();
				minIndex = i;
			}
		}System.out.println("The min value:" + min);
		System.out.println("The minIndex value: " + minIndex);
		System.out.println("Smallest word: " + a[minIndex]);
	}

	public static void main7(String[] args) {
		int i;
		int j[] = new int[] {2,5,1,9,6};
		System.out.println("value =" + j.length);

		for(i=j.length - 1; i >= 0; i--) {
			System.out.println("values in the Arrya =" + j[i]);	
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String b[]= {"true,false,false,true,false,true"};
		System.out.println("Array value =" + b.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Values in the Array =" + b[i]);
		}
		System.out.println("the array values after reversing are:");
		for(int i=(b.length-1);i>=0;i--)
		{
			System.out.println(b[i]);
		}
		sc.close();
	}
}



