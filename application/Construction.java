package application;
import java.io.*;
import java.util.*;
public class Construction
{
	void construction_estimation() throws IOException
    {
        int standard_choice,automation_choice;
        double area_of_house,total_estimation;
        Scanner sc = new Scanner (System.in);
        System.out.printf("%s","Material Options:\n1. Standard Materials\n2. Above Standard Materials\n3. High Standard Materials\n");
        System.out.printf("%s","Enter the material of the house:\n");
        standard_choice = sc.nextInt();
        System.out.write("Enter the area of the house:\n".getBytes());
        area_of_house=sc.nextDouble();
        switch(standard_choice)
        {
        	case 1 : total_estimation = area_of_house * 1200;
        			 System.out.printf("The total estimation is: %f",total_estimation);
        			 break;
        	case 2 : total_estimation = area_of_house * 1500;
        			 System.out.printf("The total estimation is: %f",total_estimation);
        			 break;
        	case 3 : System.out.printf("%s","If the house is fully automated enter 1 else enter 0:\n");
            		 automation_choice=sc.nextInt();
            		 if(automation_choice == 1)
        			 {
        			 	total_estimation = area_of_house * 2500;
        			 	System.out.printf("The total estimation is: %f",total_estimation);
        			 }
        			 else
        			 {
        				 total_estimation = area_of_house * 1800;
        				 System.out.printf("The total estimation is: %f",total_estimation);
        			 }
        			 break;
        	default : System.out.printf("%s","Select correct standard");
        }
        sc.close();
    }
}