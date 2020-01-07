package Dec12;

import java.util.Scanner;

public class RomanNumerialsToNumber1 {
		 int romanConvert(String roman)
		{
		    int decimal = 0;

		    String romanNumeral = roman.toUpperCase();
		    for(int x = 0;x<romanNumeral.length();x++)
		    {
		        char convertToDecimal = roman.charAt(x);

		        switch (convertToDecimal)
		        {
		        case 'M':
		            decimal += 1000;           //these are add the numbers checking the String
		            break;

		        case 'D':
		            decimal += 500;
		            break;

		        case 'C':
		            decimal += 100;
		            break;

		        case 'L':
		            decimal += 50;
		            break;

		        case 'X':
		            decimal += 10;
		            break;

		        case 'V':
		            decimal += 5;
		            break;

		        case 'I':
		            decimal += 1;
		            break;
		        }
		    }
		    if (romanNumeral.contains("IV"))
		    {                                //contains method is used to take the next char also 
		        decimal-=1;                  //and check it the giving condition is matched sub the values
		    }
		    if (romanNumeral.contains("IX"))
		    {
		        decimal-=1;
		    }
		    if (romanNumeral.contains("XL"))
		    {
		        decimal-=10;
		    }
		    if (romanNumeral.contains("XC"))
		    {
		        decimal-=10;
		    }
		    if (romanNumeral.contains("CD"))
		    {
		        decimal-=100;
		    }
		    if (romanNumeral.contains("CM"))
		    {
		        decimal-=100;
		    }
		    if (romanNumeral.contains("MC"))
		    {
		        decimal-=100;
		    }
		    return decimal;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		RomanNumerialsToNumber1 numberTORomanObject=new RomanNumerialsToNumber1();
		System.out.println(numberTORomanObject.romanConvert(scannerObject.next()));
			}

		}

		//Output
		//MCMXXV
		//1925

