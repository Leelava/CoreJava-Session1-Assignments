
//program  to compare the truth table of Bitwise AND and Logical AND
package Session1Assignment3;

import java.util.Scanner;

public class BitwiseANDLogicalAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number");
				
		byte a = input.nextByte();
		byte b = input.nextByte();
		boolean x = false;
		boolean y = false;
		boolean LogicalResult= false;
		int BitResult = a&b;
		System.out.println("bitwise AND of "+ a + " and "+b + " is " +BitResult );
		if( a == 1) {  x= true ; } 
		
		if( b == 1) { y= true;}
	
		LogicalResult= x && y;
		int result = 0;
		if( LogicalResult){ result = 1;}
		System.out.println("Logical AND of "+ a + " and "+b + " is " +result );
	}

}
