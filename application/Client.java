package application;
import java.io.*;
import java.util.*;
public class Client
{
    public static void main(String args[]) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.printf("%s","What do you want to calculate:\n1. Interest\n2. Construction Estimation\n");
    	int choice = sc.nextInt();
        SimpleAndCompoundInterest i = new SimpleAndCompoundInterest();
        Construction c = new Construction();
        if(choice == 1)
        {
        	System.out.printf("%s","INTEREST\n");
        	i.interest_calculation();
        }
        else
        {
        	System.out.printf("%s","CONSTRUCTION ESTIMATION\n");
        	c.construction_estimation();
        }
        sc.close();
    }
}