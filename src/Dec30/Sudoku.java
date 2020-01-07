package Dec30;

import java.util.Scanner;

/*Output
	5,3,0,0,7,0,0,0,0 
	6,0,0,1,9,5,0,0,0 
	0,9,8,0,0,0,0,6,0
	8,0,0,0,6,0,0,0,3 
	4,0,0,8,0,3,0,0,1 
	7,0,0,0,2,0,0,0,6
	0,6,0,0,0,0,2,8,0 
	0,0,0,4,1,9,0,0,5
	0,0,0,0,8,0,0,7,9

	solution
	5 3 4 6 7 8 9 1 2 
	6 7 2 1 9 5 3 4 8 
	1 9 8 3 4 2 5 6 7 
	8 5 9 7 6 1 4 2 3 
	4 2 6 8 5 3 7 9 1 
	7 1 3 9 2 4 8 5 6 
	9 6 1 5 3 7 2 8 4 
	2 8 7 4 1 9 6 3 5 
	3 4 5 2 8 6 1 7 9 */
public class Sudoku {
		
		//issafe this method is used to check the input value is inside of the 3*3 box and 
		//same column and row
		
		public static boolean isSafe(int[][] sudoku, int row, int col,int num)  
		{ 
		for (int i = 0; i < sudoku.length; i++)  
		{ 
		if (sudoku[row][i] == num)  
		{ 
		return false; 
		} 
		} 
		for (int j = 0; j < sudoku.length; j++) 
		{ 
		if (sudoku[j][col] == num) 
		{ 
		return false; 
		} 
		} 
		int SRT = (int) Math.sqrt(sudoku.length); 
		int boxRowStart = row - row % SRT; 
		int boxColStart = col - col % SRT; 

		for (int i = boxRowStart;i < boxRowStart + SRT; i++)  
		{ 
		for (int j = boxColStart;j < boxColStart + SRT; j++)  
		{ 
		if (sudoku[i][j] == num)  
		{ 
		return false; 
		} 
		} 
		} 

		return true; 
		} 
		
		
		//This one is place the values and check the box is empty or not

		public static boolean solveSudoku(int[][] sudoku, int n)  
		{ 
		int row = -1; 
		int col = -1; 
		boolean isEmpty = true; 
		for (int i = 0; i < n; i++) 
		{ 
		for (int j = 0; j < n; j++)  
		{ 
		if (sudoku[i][j] == 0)  
		{ 
		row = i; 
		col = j; 
		isEmpty = false;  
		break; 
		} 
		} 
		if (!isEmpty) 
		{ 
		break; 
		} 
		} 
		if (isEmpty)  
		{ 
		return true; 
		} 
		for (int num = 1; num <= n; num++) 
		{ 
		if (isSafe(sudoku, row, col, num)) 
		{ 
		sudoku[row][col] = num; 
		if (solveSudoku(sudoku, n))  
		{ 
		return true; 
		}  
		else
		{ 
		sudoku[row][col] = 0; // replace it 
		} 
		} 
		} 
		return false; 
		} 

		
		//This one is print the solution 
		
		public static void print(int[][] board, int N) 
		{ 
		for (int i = 0; i < N; i++) 
		{ 
		for (int j = 0; j < N; j++) 
		{ 
		System.out.print(board[i][j]+" "); 
		} 
		System.out.print("\n"); 

		if ((i + 1) % (int) Math.sqrt(N) == 0)  
		{ 
		System.out.print(""); 
		} 
		} 
		} 
		
		//This one is input of the sudoku
		
		static int [][] input(int n)
		{int given[][]=new int[n][n];
		System.out.println("Enter the input of the sudoku");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n	;j++)
				{
					given[i][j]=scannerObject.nextInt();
				}
			}
			return given;
		}
		static Scanner scannerObject=new Scanner(System.in);
		public static void main(String args[]) 
		{ 
		int N=9;
		int sudoku[][]=input(N);
		if (solveSudoku(sudoku, N)) 
		{ 
		print(sudoku, N); // print solution 
		}  
		else
		{ 
		System.out.println("No solution"); 
		} 
		}
	}