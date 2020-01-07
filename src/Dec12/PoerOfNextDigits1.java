package Dec12;

import java.util.Scanner;

public class PoerOfNextDigits1 {
	//This one is used to count the digits
		static int digitCount(int number)
		{
			int count=0;
			while(number>0)
			{
				int c=number%10;
				count++;
				number=number/10;
			}
			return count;
		}
		static //This method is used to store the int value in Array
		int[] storedInArray(int number)
		{	int m[]=new int[digitCount(number)];
			for(int i=0;i<m.length;i++)
			{
				m[i]=number%10;
				number=number/10;
			}
			return m;
		}
		static void result(int number)
		{
			int digitSplit[]=storedInArray(number);
			double sum= 0;
			for(int i=digitSplit.length-1;i>=0;i--)
			{if(i==0)
			{
				sum=sum+Math.pow(digitSplit[i],digitSplit[digitSplit.length-1]);
			}
			else
				sum=sum+Math.pow(digitSplit[i],digitSplit[i-1]);
			}
			System.out.println("The Sum of series power value is "+sum);
				}

			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	int number=scannerObject.nextInt();
	result(number);


	//Output
	//3456
	//The Sum of series power value is 16946.0
		}
}
