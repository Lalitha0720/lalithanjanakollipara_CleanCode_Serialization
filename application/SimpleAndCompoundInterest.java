package application;
import java.io.*;
import java.util.*;
public class SimpleAndCompoundInterest
{
	void interest_calculation() throws IOException
	{
		double simple_interest,compound_interest,principle,rate_of_interest;
		int choice,time;
		Scanner sc = new Scanner(System.in);
		System.out.write("Enter the principle amount:\n".getBytes());
		principle = sc.nextDouble();
		System.out.write("Enter the rate of interest:\n".getBytes());
		rate_of_interest = sc.nextDouble();
		System.out.write("Enter the time:\n".getBytes());
		time = sc.nextInt();
		System.out.format("%s","1. Simple Interest\n2. Compound Interest\n");
		System.out.write("Choose which interest to calculate:\n".getBytes());
		choice = sc.nextInt();
		switch(choice)
		{
			case 1: simple_interest=(principle*rate_of_interest*time)/100;
        			System.out.printf("Simple Interest is : %f \n",simple_interest);
        			break;
			case 2: compound_interest=principle*Math.pow((1+(rate_of_interest/100)),time);
					System.out.printf("Compound Interest is : %f \n",compound_interest);
					break;
			default: System.out.write("Invalid choice\n".getBytes());
		}
		sc.close();
	}
}