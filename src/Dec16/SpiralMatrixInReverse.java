package Dec16;

import java.util.Scanner;


//Output
//Enter the row value
//4
//Enter the column value
//4
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
//10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1 
public class SpiralMatrixInReverse {
	public static void reversespiralPrint(int m, int n, 
          int a[][]) 
{  long b[] = new long[100]; 
int i, k = 0, l = 0; 
int z = 0;
int size = m * n; 
while (k < m && l < n) 
{ 
  for (i = l; i < n; ++i) 
  { 
  	 b[z]= a[k][i]; 
      ++z; 
  } 
  k++; 
  for (i = k; i < m; ++i) 
  { 
        
  	b[z] = a[i][n-1]; 
      ++z; 
  } 
  n--; 
  if ( k < m) 
  { 
      for (i = n-1; i >= l; --i) 
      { 
      	 b[z]  = a[m-1][i]; 
          ++z; 
      } 
      m--; 
  } 
  if (l < n) 
  { 
      for (i = m-1; i >= k; --i) 
      {             
      	b[z]  = a[i][l]; 
          ++z; 
      } 
      l++; 
  } 
} 

for (int x = size-1 ; x>=0 ; --x) 
{ 
  System.out.print(b[x]+" "); 
} 

}
	static Scanner scannerObject=new Scanner(System.in);
	static int[][] getInput(int row,int col)
	{
		
		
		  int a[][]=new int [row][col];
		  for(int i=0;i<row;i++)
		  {
			  for(int j=0;j<col;j++)
			  {
				  a[i][j]=scannerObject.nextInt();
			
			  }
		  }	 
		  return a;
	}
	public static void main(String[] args) 
		// TOcolO Auto-generatecol methocol stub
		  { 
		  System.out.println("Enter the row value");
		  int row=scannerObject.nextInt();
		  System.out.println("Enter the rowolumn value");
		  int col=scannerObject.nextInt();
			   int a[][]=getInput(row,col);
		        reversespiralPrint(row, col, a); 
		         
		    } 
	}

