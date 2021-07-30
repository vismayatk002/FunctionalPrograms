package functionalPrograms;



import java.util.Scanner;

public class TwoDArray {
	
	public static void print(int[][] matrix , int row , int column) {
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				
				System.out.println(matrix[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		
		//Read only integer
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows : ");
		int row = sc.nextInt();
		System.out.print("\nEnter the number of Columns : ");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Enter the number  : ");
				matrix[i][j] = sc.nextInt();
			}
		}
		print(matrix , row , column);
		sc.close();
	}

}
