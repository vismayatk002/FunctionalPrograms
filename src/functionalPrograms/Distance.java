package functionalPrograms;

//import java.util.Scanner;

public class Distance {
	
	public static void getDistance(double x , double y) {
		
		double distance = (double)(Math.sqrt(Math.pow(x , 2) + Math.pow(y, 2)));
		System.out.printf("Euclidean Distance : %.2f " , distance);
	}
	public static void main(String[] args) {
		
		double x = Integer.parseInt(args[0]);
		double y = Integer.parseInt(args[1]);
		//for testing
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter x-coodinate : ");
//		double x = sc.nextDouble();
//		System.out.print("Enter y-coodinate : ");
//		double y = sc.nextDouble();
		getDistance(x , y);
//		sc.close();
	}
}
