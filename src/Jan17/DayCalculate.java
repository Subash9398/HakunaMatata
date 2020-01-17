package Jan17;

import java.util.Arrays;
import java.util.Scanner;

public class DayCalculate {
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
				int c=b[1]-a[1];
				monthadd=c/2;          //month calculation
				a[1]=a[1]*30;           //multiply the months 30
				b[1]=b[1]*30;
				leep=(b[2]-a[2])/4;     //leep year calculation
				a[2]=a[2]*365;         //multiply the years 365 
				b[2]=b[2]*365;
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
