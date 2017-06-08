//Program to add two numbers without using + sign.

package Session1Assignment1;

import java.util.Scanner;

public class AddWithoutPlus
{
	
   public static void main(String[] args) 
  {
	   
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers to be added:");

        int x = input.nextInt();

        int y = input.nextInt();
        
        int sum=x-(-y);

        System.out.println("The Sum of  "+ x +" and " + y + " is " +sum);

        input.close();

	}

}
 

	