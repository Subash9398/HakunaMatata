package Dec16;

import java.util.Scanner;

public class DaysCalculation {
	static void calculate(String firstDate,String secondDate)
	{
		
		String []splitFirstDate=firstDate.split(" ");
		String splitSecondDate[]=secondDate.split(" ");
		int a[]=new int[splitFirstDate.length];
		int b[]=new int[splitSecondDate.length];
		for(int i=0;i<splitFirstDate.length;i++)
		{
			a[i]=Integer.parseInt(splitFirstDate[i]);
			b[i]=Integer.parseInt(splitSecondDate[i]);
		}
		int leep = 0,monthadd=0;
		for(int i=0;i<a.length;i++)
		{ 
			if(i==2)
			{
				leep=(b[i]-a[i])/4;
			}
			if(leep==0)
			{
				if (i==1)
				{
					int c=b[i]-a[i];
					monthadd=c/2;
				}
			}
			if(i==1)
			{
				a[i]=a[i]*30;           //multiply the months 30
				b[i]=b[i]*30;
			}
			else if(i==2)
			{
				a[i]=a[i]*365;         //multiply the years 365 
				b[i]=b[i]*365;
			}
		}
		int countOfDays=0;
		for(int i=0;i<a.length;i++)
		{
			countOfDays=countOfDays+(b[i]-a[i]);  //totally sub current date and the given date 
		}                                         //values are counted
		countOfDays=countOfDays+leep+monthadd;
		System.out.println(countOfDays);
	}
	public static void main(String args[])
	{    //get input from user 
		Scanner scannerObject=new Scanner(System.in);
		String firstDate=scannerObject.nextLine();
		String secondDate=scannerObject.nextLine();
		calculate(firstDate,secondDate);

	}
}

//Output
//11 11 1992
//07 01 2020
//9918
