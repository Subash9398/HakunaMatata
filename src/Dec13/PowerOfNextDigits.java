package Dec13;

import java.util.Scanner;

public class PowerOfNextDigits {
			static int[] copyToIntegerArray(String value)    //This method is used to copy the String value to int array
			{
				int []inInteger=new int[value.length()];
				for(int i=0;i<value.length();i++)
				{
					inInteger[i]=value.charAt(i)-48;
				}	
				return inInteger;
			}
static void result(String input)
{
	
	int []inInteger=copyToIntegerArray(input);
	double sum= 0;
	for(int i=0;i<inInteger.length;i++)
	{if(i==inInteger.length-1)
	{
	sum=sum+Math.pow(inInteger[i],inInteger[0]);
	}
	else
	sum=sum+Math.pow(inInteger[i],inInteger[i+1]);
	}
	System.out.println("The Sum of series power value is "+sum);
	}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		String input=scannerObject.next();
        result(input);
		//Output
		//3456
		//The Sum of series power value is 16946.0
}
}