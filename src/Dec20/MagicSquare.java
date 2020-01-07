package Dec20;

import java.util.Scanner;

/*Output
	5
	The Magic Square for 5:
	Sum of each row or column 65:
	9 3 22 16 15 
	2 21 20 14 8 
	25 19 13 7 1 
	18 12 6 5 24 
	11 10 4 23 17 
	*/

public class MagicSquare {
		 static void magicSquare(int n) 
		    { 
		        int[][] square = new int[n][n]; 
		        int i = n/2; 
		        int j = n-1; 
		        for (int num=1; num <= n*n; ) 
		        { 
		            if (i==-1 && j==n) 
		            {
		                j = n-2; 
		                i = 0; 
		            } 
		            else
		            {  
		                if (j == n) 
		                    j = 0; 
		                if (i < 0) 
		                    i=n-1; 
		            } 
		            if (square[i][j] != 0)  
		            { 
		                j -= 2; 
		                i++; 
		                continue; 
		            } 
		            else
		                square[i][j] = num++;  
		            j++;  i--;  
		        } 
		        System.out.println("The Magic Square for "+n+":"); 
		        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
		        for(i=0; i<n; i++) 
		        { 
		            for(j=0; j<n; j++) 
		                System.out.print(square[i][j]+" "); 
		            System.out.println(); 
		        } 
		    } 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scannerObject=new Scanner(System.in);
			int number=scannerObject.nextInt();
	        magicSquare(number); 
		}}