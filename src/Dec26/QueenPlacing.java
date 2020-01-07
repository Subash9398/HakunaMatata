package Dec26;


	/*Output

	1  0  0  0  0  0  0  0 
	0  0  0  0  0  0  1  0 
	0  0  0  0  1  0  0  0 
	0  0  0  0  0  0  0  1 
	0  1  0  0  0  0  0  0 
	0  0  0  1  0  0  0  0 
	0  0  0  0  0  1  0  0 
	0  0  1  0  0  0  0  0 
	*/

public class QueenPlacing {
		  final int N = 8; 
		  
		    void print(int board[][]) 
		    { 
		        for (int i = 0; i < N; i++) { 
		            for (int j = 0; j < N; j++) 
		                System.out.print(" " + board[i][j] 
		                                 + " "); 
		            System.out.println(); 
		        } 
		    } 
		 
		    boolean oneisthere(int board[][], int row, int col) 
		    { 
		        int i, j; 
		  
		        for (i = 0; i < col; i++) 
		            if (board[row][i] == 1) 
		                return false; 
		  
		        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
		            if (board[i][j] == 1) 
		                return false; 
		  

		        for (i = row, j = col; j >= 0 && i < N; i++, j--) 
		            if (board[i][j] == 1) 
		                return false; 
		  
		        return true; 
		    } 
		    boolean placequeen(int board[][], int col) 
		    { 
		     
		    	//This condition is return the true value for after placing
		        if (col >= N) 
		            return true;
		        //This loop is increasing the row values
		        
		        for (int i = 0; i < N; i++) { 
		            
		        	//this if condition is check the no 1 is in the matrix 
		        	
		            if (oneisthere(board, i, col)) { 
		                board[i][col] = 1; 
		                
		  //This is a recursion for recall the placequeen method 
		    //and increase the col value
		                
		                if (placequeen(board, col + 1) == true) 
		                    return true; 
		  
		             // BACKTRACK line is change the value to last placed 1 to 0
		                
		                board[i][col] = 0; 
		            } 
		        } 
	//the false is return the previous if condition
		        return false; 
		    } 
		  
		    boolean solve() 
		    { 
		        int board[][] = { { 0, 0, 0, 0, 0, 0, 0, 0 }, 
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 },  
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
		        		          { 0, 0, 0, 0, 0, 0, 0, 0 }, }; 
		  
		        if (placequeen(board, 0) == false) { 
		            System.out.print("Solution does not exist"); 
		            return false; 
		        } 
		  
		        print(board); 
		        return true; 
		    } 
		  
		    public static void main(String args[]) 
		    { 
		        QueenPlacing Queen = new QueenPlacing(); 
		        Queen.solve(); 
		    } 
	}