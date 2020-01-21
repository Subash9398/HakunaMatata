package Jan20;

import java.util.Scanner;

public class PrintTheUniqueNumbers {
	static int count(int number)
	{int count=0;
	while(number>0)
	{
		number=number/10;
		count++;
	}
		return count;
	}
	static void print(int firstNumber,int secondNumber)
	{
		for(int i=firstNumber;i<=secondNumber;i++)
		{int localVariable=i;;
		int count=0;
		int []splitNumber=new int[count(localVariable)];
			for(int m=0;localVariable>0;m++)
			{
				splitNumber[m]=localVariable%10;
				localVariable=localVariable/10;	
			}
			for(int j=0;j<splitNumber.length-1;j++)
			{int m=splitNumber[j];
				for(int k=j+1;k<splitNumber.length;k++)
				{
				if(m==splitNumber[k])
					count++;}
			}
			if(count==0)
				System.out.println("Numbers are -"+i);}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the First number");
		int firstNumber=scannerObject.nextInt();
		System.out.println("Enter the second Number");
		int secondNumber=scannerObject.nextInt();
		print(firstNumber,secondNumber);
	}
}
