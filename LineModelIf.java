package com.problemstatement;

import java.util.Scanner;

public class LineModelIf {
	public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Programme");
			int x1, x2, y1, y2;
			int a1, a2, b1, b2;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter x1 value ; ");
			x1 = s.nextInt();
			System.out.println("Enter y1 value ; ");
			y1 = s.nextInt();
			System.out.println("Enter x2 value ; ");
			x2 = s.nextInt();
			System.out.println("Enter y2 value ; ");
			y2 = s.nextInt();
			System.out.println("Enter a1 value ; ");
			a1 = s.nextInt();
			System.out.println("Enter b1 value ; ");
			b1 = s.nextInt();
			System.out.println("Enter a2 value ; ");
			a2 = s.nextInt();
			System.out.println("Enter b2 value ; ");
			b2 = s.nextInt();
			double res , res1 ;
			res = Math.sqrt((x2-x1)^2+(y2-y1)^2);
			res1 = Math.sqrt((a2-a1)^2+(b2-b1)^2);
			System.out.println("Length of first line is : "+res);
			System.out.println("Length of second line is : "+res1);
			if (res == res1) {
				System.out.println("The two lines are equal");
			}else { 
				if(res > res1) 
				System.out.println("First line is longer than Second line");
				}  {
					System.out.println("First line is shorter than Second line");
				}
		}
}
