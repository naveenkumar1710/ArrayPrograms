package com.demo;
import java.util.Scanner;
import java.util.Arrays;

public class aRemoveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in); 
		System.out.println("Enter array length");
		int n=Sc.nextInt();
		int[]arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=Sc.nextInt();
			}
			int size=arr.length-1;
		   int[]removeArr=new int[size];
			int j=0;
			//int[]arr= {10,20,30,40,50}; 
			
			for(int i=0;i<arr.length;i++) {
				if(i!=2) {
					removeArr[j]=arr[i];
					j++;
				}
			}
			System.out.println(Arrays.toString(removeArr));
	}
}
