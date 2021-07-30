package functionalPrograms;

import java.util.Scanner;

public class NumberSumZero {
	
	public static void findTriples(int[] arr){
		
		int triplesCount = 0; 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					// Check the sum of combination is zero
					if(arr[i] + arr[j] + arr[k] == 0){
						// Condition to print the line only once
						if(triplesCount == 0) {
							System.out.println("Triples available in array");
						}
						System.out.println("(" + i + " ," + j + " ," + k+ ")");
						triplesCount++;
					}
				}
			}
		}
		if(triplesCount == 0) {
			System.out.println("Array doesn't have triples");
		}else {
			System.out.println("Triples count : " + triplesCount);
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
