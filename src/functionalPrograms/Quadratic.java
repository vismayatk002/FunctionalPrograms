package functionalPrograms;

import java.util.Scanner;
import java.lang.Math;  

public class Quadratic {

	static void calculateRoots(double a , double b , double c ){
		
		double root1 = 0 , root2 = 0;
		double delta =((b * b) - (4 * a * c));
		if(delta > 0) {
			root1 = (-(double)b + Math.sqrt(delta)) / (2 * a) ;
			root2 = (-(double)b - Math.sqrt(delta)) / (2 * a) ;
			System.out.printf("Roots of Equation x1 : %.2f x2 : %.2f", root1, root2);
		}
		else if(delta == 0){
			root1 = (-(double)b - Math.sqrt(delta)) / (2 * a) ;
			System.out.printf("Roots of Equation x1 : %.2f", root1);
		}
		else {
			System.out.print("Roots of Equation is imaginary");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for a : ");
		double a = sc.nextDouble();
		System.out.print("Enter value for b : ");
		double b = sc.nextDouble();
		System.out.print("Enter value for c : ");
		double c = sc.nextDouble();
		//calling method
		calculateRoots(a,b,c);
		
		sc.close();
	}
}