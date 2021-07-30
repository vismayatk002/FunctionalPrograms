package functionalPrograms;

import java.util.Scanner;

public class WindChill {

	public static void windChillCalutate(double t , double v){
		
		if(t < 50 && v > 3 && v < 120){
			
			double windChill = (double)(35.74 + (0.6215 * t) + (((t * 0.4275) - 35.75) * (Math.pow(v, 0.16))));
			System.out.printf(" Wind Chill : %.2f " , windChill);
		}
		else {
			System.out.printf("Invalid Input");
		}
	}
	public static void main(String[] args) {
		
		//convert command line argument to integer
		//int N =Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature(in faharenheit)below 50 : ");
		double t = sc.nextInt();
		System.out.print("Enter the wind speed(inmiles per hour)between 3 & 120 : ");
		double v = sc.nextInt();
		windChillCalutate(t , v);
		sc.close();
	}
}
