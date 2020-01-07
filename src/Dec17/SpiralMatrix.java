package Dec17;
import java.util.Scanner;
public class SpiralMatrix {

//Output
//Enter the row value
//4
//Enter the column value
//4
//Enter the values
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
//16
//the values are in spiral form
//1 2 3 4 
//12 13 14 5 
//11 16 15 6 
//10 9 8 7 

	static int[][] spiralinput(int m,int n)
{  
		System.out.println("Enter the values");
		Scanner scannerObject=new Scanner(System.in);
		int [][]a=new int[m][n];
int i, k = 0, l = 0; 
int z = 0;
int size = m * n; 
while (k < m && l < n) 
{ 
    for (i = l; i < n; ++i) 
    { 
    	  a[k][i]=scannerObject.nextInt(); 
        ++z; 
    } 
    k++; 
    for (i = k; i < m; ++i) 
    { 
          
    	a[i][n-1]=scannerObject.nextInt(); 
        ++z; 
    } 
    n--; 
    if ( k < m) 
    { 
        for (i = n-1; i >= l; --i) 
        { 
        	 a[m-1][i]=scannerObject.nextInt(); 
            ++z; 
        } 
        m--; 
    } 
    if (l < n) 
    { 
        for (i = m-1; i >= k; --i) 
        {             
        	 a[i][l]=scannerObject.nextInt(); 
            ++z; 
        } 
        l++; 
    } 
} 
return a;
} 
	static void print(int  a[][])
	{
		System.out.println("the values are in spiral form");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the row value");
int row=scannerObject.nextInt();
System.out.println("Enter the column value");
int col=scannerObject.nextInt();
int a[][]=spiralinput(row,col);
print(a);
	}

}
