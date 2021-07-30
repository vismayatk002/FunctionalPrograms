package functionalPrograms;

import java.util.Scanner;

public class NumberSumZero {
	
	public static void findTriples(int[] arr){
		
		int sum;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum == 0){
						System.out.print( "\n" + i + " " + j + " " + k);
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count  : ");
		int count = sc.nextInt();
		int[] arr = new int[count];
		System.out.print("Enter the numbers \n");
		for(int i=0; i<count; i++) {
			arr[i] =  sc.nextInt();
		}
		findTriples(arr);
		sc.close();
	}
}
