package Dec19;

import java.util.Scanner;

/*
	 * output
	 9
	         9
	        898
	       78987
	      6789876
	     567898765
	    45678987654
	   3456789876543
	  234567898765432
	 12345678987654321
	0123456789876543210
	 */

public class PrintNumbersTriangle {
		static void print(int number)
		{
			int localvariable=number;
			for(int row=number;row>=0;row--)
			{localvariable=row;
				for(int colspace=1;colspace<=row;colspace++)
				{
					System.out.print(" ");
					
						}
				for(int colstar=number;colstar>=row;colstar--)
				{
					System.out.print(localvariable);
					localvariable++;
				}
				for(int colstar=number-1;colstar>=row;colstar--)
				{
					System.out.print(colstar);
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scannerObject=new Scanner(System.in);
			int number=scannerObject.nextInt();
		print(number);
		}

	}
