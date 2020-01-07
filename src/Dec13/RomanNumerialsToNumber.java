package Dec13;

import java.util.Scanner;

public class RomanNumerialsToNumber {
	//This method is used to check the values of the letters
		int value(char a)
		{
			if(a=='I')
				return 1;
			if(a=='V')
				return 5;
			if(a=='X')
				return 10;
			if(a=='L')
				return 50;
			if(a=='C')
				return 100;
			if(a=='D')
				return 500;
			if(a=='M')
				return 1000;
			return -1;
			
		}
		//This method is used to convert RomanNumber to decimel
		int romanToDecimel(String romanletter)
		{ int decimel=0;
			for(int i=0;i<romanletter.length();i++)
			{
				//First the char is enter to the loop
				int j=value(romanletter.charAt(i));
				//Store the first roman letter to Decimle in j using value method
				if(i+1<romanletter.length())
				{
					//Then after check the second letter is there or not
				int k=value(romanletter.charAt(i+1));
				//If second one is there means store the second one to k variable using value method
				if(j>=k)
				{
					//Then compare the two values the First one is big means Add in Decimel variable
					//means VI means 5+1
					decimel=decimel+j;
				}
				else
				{
					//Otherwise add k value and sub j value means IV means 5-1
					decimel=decimel+k-j;
				}
				}
				//or otherwise only one is there like V directly add to Decimel
				else
				{
					decimel=decimel+j;
				}
				
			}
			return decimel;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	String romanLetter=scannerObject.next();
	RomanNumerialsToNumber romannumerialsObject=new RomanNumerialsToNumber();
	System.out.println(romannumerialsObject.romanToDecimel(romanLetter));
	}}

	//Output
	//MMMCMXXIIV
	//3930

