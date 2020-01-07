package Dec17;
	//Output
	//Enter the value of Array length
	//9
	//Enter the values
	//4
	//5
	//8
	//9
	//23
	//6
	//8
	//2
	//1
	//8 2 1 
	import java.util.Scanner;
	public class ContinuousSubArrayInGivenNumber {
	static void findsubarray(int []a)
	{
		int b=11, i=0,j=0;int m=0,count=0;
		for(;i<a.length-2;i++)
		{
			for(j=i;j<a.length;j++)
			{
				 m=m+a[j];
				 if(m>b)
				 { break;}
			}
			if(m==b) {count++;break;}
			m=0;
		}	
		if(count==1)
		{
		for(int k=i;k<j;k++)
			System.out.print(a[k]+" ");
		}	}

	static int[] getinput(int n)
	{
		 Scanner scannerObject=new Scanner(System.in);
		 int a[]=new int[n];
		 System.out.println("Enter the values");
		 for(int i=0;i<a.length;i++)
		 {
		 	a[i]=scannerObject.nextInt();
		 }
		 return a;
	}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	System.out.println("Enter the value of Array length");
	findsubarray(getinput(scannerObject.nextInt()));
		}}