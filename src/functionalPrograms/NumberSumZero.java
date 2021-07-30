package functionalPrograms;

import java.util.Scanner;

public class NumberSumZero {
	
	public static void findTriples(int[] arr){
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == 0){
						System.out.println("Numbers :" + arr[i] + " ," + arr[j] + " ," + arr[k]);
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
