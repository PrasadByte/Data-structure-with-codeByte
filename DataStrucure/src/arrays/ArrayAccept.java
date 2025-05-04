package arrays;

import java.util.Scanner;

public class ArrayAccept {
	
	public int []acceptr(int n) {
		int arr[]=new int[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value of "+i+" index");
			arr[i]=sc.nextInt();
		}
		System.out.println("The values of the array are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		return arr;
	}
	
	public static void main(String[] args) {
	
	}
}
