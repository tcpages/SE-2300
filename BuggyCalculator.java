package Assign5;

import java.util.Scanner;

// A buggy simple calculator program
public class BuggyCalculator 
{
	public int add(int a, int b) 
	{
		return a + b;
	}
	
	public int subtract(int a, int b) 
	{
		return a - b;
	}
	
	public int multiply(int a, int b) 
	{
		return a * b;
	}
	
	public double divide(int a, int b) 
	{
		if(b == 0)
		{
			System.out.println("Invalid Input for Division");
			return 0.0;
		}
		return (double) a / (double) b;
	}
	
	
	public static void main(String[] args) 
	{
		BuggyCalculator calc = new BuggyCalculator();
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			try
			{
				System.out.println("Please enter the first integer number:");
				a = input.nextInt();
				System.out.println("Please enter the second integer number:");
				b = input.nextInt();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Invalid input, please try again");
				input.next();
			}
		}
		
		
		System.out.println("Addition: " + calc.add(a, b));
		System.out.println("Subtraction: " + calc.subtract(a, b));
		System.out.println("Multiplication: " + calc.multiply(a, b));
		System.out.println("Division: " + calc.divide(a, b));
		
		System.out.println("");
		
		System.out.println("Addition: " + calc.add(-1, -5));
		System.out.println("Subtraction: " + calc.subtract(-1, -5));
		System.out.println("Multiplication: " + calc.multiply(-1, -5));
		System.out.println("Division: " + calc.divide(-1, -5));
		
		System.out.println("");
		
		System.out.println("Addition: " + calc.add(0, 7));
		System.out.println("Subtraction: " + calc.subtract(0, 7));
		System.out.println("Multiplication: " + calc.multiply(0, 7));
		System.out.println("Division: " + calc.divide(0, 7));
		
		System.out.println("");
		
		System.out.println("Addition: " + calc.add(2, -7));
		System.out.println("Subtraction: " + calc.subtract(2, -7));
		System.out.println("Multiplication: " + calc.multiply(2, -7));
		System.out.println("Division: " + calc.divide(2, -7));
		
		System.out.println("");
		
		System.out.println("Addition: " + calc.add(10, 0));
		System.out.println("Subtraction: " + calc.subtract(10, 0));
		System.out.println("Multiplication: " + calc.multiply(10, 0));
		System.out.println("Division: " + calc.divide(10, 0));
		
		System.out.println("");
		
		System.out.println("Addition: " + calc.add(7, 7));
		System.out.println("Subtraction: " + calc.subtract(7, 7));
		System.out.println("Multiplication: " + calc.multiply(7, 7));
		System.out.println("Division: " + calc.divide(7, 7));
		
		System.out.println("");
		
		System.out.println("Addition: " + calc.add(6, 12));
		System.out.println("Subtraction: " + calc.subtract(6, 12));
		System.out.println("Multiplication: " + calc.multiply(6, 12));
		System.out.println("Division: " + calc.divide(6, 12));
		
	}
}
