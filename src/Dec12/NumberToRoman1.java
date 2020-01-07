package Dec12;

import java.util.Scanner;

public class NumberToRoman1 {
	//This method have a two arrays split the number and check the array and concord string
			String numberToRoaman(int number)
			{
				String roman="";
			    int numbers[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
			    String romanLetters[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
			    int i=12;     
			    while(number>0) 
			    { 
			      int count = number/numbers[i]; 
			      number = number%numbers[i]; 
			      while(count>0) 
			      { 
			        roman=roman+romanLetters[i];
			        count--;
			      } 
			      i--; 
			    } 
			    return roman;   //return the String
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				NumberToRoman1 numbertoromanObject=new NumberToRoman1();
				Scanner scannerObject=new Scanner(System.in);
				int number=scannerObject.nextInt();
				System.out.println(numbertoromanObject.numberToRoaman(number));
			}}

		//Output
		//1992
		//MCMXCII
