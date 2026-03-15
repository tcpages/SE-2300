package Assign5;

import java.util.Scanner;

// A buggy factorial calculator program
public class BuggyFactorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else {
            int result = 1; 
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) 
    {
    	
    	Scanner input = new Scanner(System.in);
    	int number = 0;
    	
    	
        while(true)
        {
        	
        	try 
            {
        		System.out.println("Please enter a non-negative integer:");
            	number = input.nextInt();
            	
            	if(number < 0)
            	{
            		System.out.println("You enter a negative number, please retry with a positive number");
            		continue;
            	}
            	
                System.out.println("The factorial of " + number + " is " + factorial(number));
                break;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Error: Invalid input. Please enter a non-negative integer.");
                input.next();
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("Error: " + e.getMessage());
                input.next();
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid Input error: Please try again" + e.getMessage());
                input.next();
            }
        }
        

    }
}
