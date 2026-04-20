package sample;

import java.util.Arrays;

public class ReversingArray {
	public static int[] arrSam = new int[] {1,2,3,4,5};
	public static int size = -1;
	public static int capacity = 0;
	
	
	public static void method1(int[] arr) {
//		if(arrSam.length == size) {
//			return;
//		}
		size++;
		int temp = arrSam[size];
		method2(size, arrSam);
		addValue(temp);
	}
	
	public static void addValue( int value) {
		arrSam[capacity] = value;
		capacity++;
	}
	
	public static void method2(int index, int[] arr) {
		if(index == arr.length-1) {
			return;
		}
		
		method1(arr);
		return;
	}
	
	public static void main(String[] args) {
		int[]arr = new int[] {1,2,3,4,5,6};
		int[] arr2 = new int[6];
		
		int index = 0;
		for(int i = arr.length -1; i >= 0; i-- ) {
			arr2[index] = arr[i];
			index++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		int i = 0;
		int j = arr.length-1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println("The reversed two pointer"+ Arrays.toString(arr));
		
		ReversingArray array = new ReversingArray(); 
		array.method1(arrSam);
		System.out.println("result by regression" +Arrays.toString(arrSam));
		
	}

}
