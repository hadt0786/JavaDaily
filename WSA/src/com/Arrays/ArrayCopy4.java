package com.Arrays;

public class ArrayCopy4 {
	
	
	public static void main(String[] args){
		
		int arr1[] = {0,1,2,3,4,5};
		int arr2[] = {5,10,20,30,40};
		
		System.arraycopy(arr1, 0, arr2, 0,1);
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println("Array2 = ");
			System.out.println(arr2[i]+" = "+i);
				
		}
		
	}

}
