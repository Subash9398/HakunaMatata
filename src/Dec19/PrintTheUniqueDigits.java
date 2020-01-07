package Dec19;


	/*
	 * Output
	Enter the First number
	134
	Enter the second Number
	155
	Numbers are -134
	Numbers are -135
	Numbers are -136
	Numbers are -137
	Numbers are -138
	Numbers are -139
	Numbers are -140
	Numbers are -142
	Numbers are -143
	Numbers are -145
	Numbers are -146
	Numbers are -147
	Numbers are -148
	Numbers are -149
	Numbers are -150
	Numbers are -152
	Numbers are -153
	Numbers are -154

	 */
	import java.util.ArrayList;
	import java.util.Scanner;

	public class PrintTheUniqueDigits {
	static void print(int firstNumber,int secondNumber)
	{
		for(int i=firstNumber;i<=secondNumber;i++)
		{int localVariable=i;;
		int count=0;
		ArrayList splitNumber=new ArrayList();
			while(localVariable>0)
			{
				splitNumber.add(localVariable%10);
				localVariable=localVariable/10;	
			}
			for(int j=0;j<splitNumber.size()-1;j++)
			{int m=Integer.parseInt(splitNumber.get(j).toString());
				for(int k=j+1;k<splitNumber.size();k++)
				{
				if(m==(int)Integer.parseInt(splitNumber.get(k).toString()))
					count++;}
			}
			if(count==0)
				System.out.println("Numbers are -"+i);
		}	
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