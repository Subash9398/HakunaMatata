package Dec27;


	/*Output
	0  0  0  0  0  0  0  0 
	0  0  0  0  0  0  0  0 
	1  1  0  0  0  0  0  0 
	0  1  0  0  0  0  0  0 
	0  1  0  1  1  1  0  0 
	0  1  1  1  0  1  0  0 
	0  0  0  0  0  1  1  1 
	0  0  0  0  0  0  0  0 */


public class PathFinding {
		static int N; 

		    void print(int path[][]) 
		    { 
		        for (int i = 0; i < N; i++) { 
		            for (int j = 0; j < N; j++) 
		                System.out.print(" " + path[i][j] + " "); 
		            System.out.println(); 
		        } } 
		    boolean find(int givenMatrix[][]) 
		    { 
		    	//This one is used to find the first entrance 
		    	
		    	int path[][] = new int[N][N];
		        int x=0,y=0;
		        for(;x<N;x++)
		        {
		        	if(givenMatrix[x][y]==1)
		        		break;
		        }
		  
		        //This one is used to find the correct path
		        //If path is not available print the solution 
		        
		        if (solveMain(givenMatrix, x, y, path) == false) { 
		            System.out.print("Solution doesn't exist"); 
		           
		        } 
	 	        print(path); 
		        return true; 
		    }
		    
		    //This method is used to find the one is available in the given matrix 
		    
		    boolean oneisthere(int givenMatrix[][], int x, int y,int path[][]) 
		    { 
		        return (x >= 0 && x < N && y >= 0 && y < N && givenMatrix[x][y] == 1 && path[x][y] == 0); 
		    } 
		 
		    //This is find the next next paths via recursion method
		    
		    boolean solveMain(int givenMatrix[][], int x, int y,int path[][])                  
		    { 
		    	
		    	//This one is used to find the last out
		    	
		        if (y==N-1) { 
		            path[x][y] = 1; 
		            return true; 
		        }      
		        
		        //this one is set the path matrix
		        if (oneisthere(givenMatrix, x, y,path) == true) { 
		     	            path[x][y] = 1; 
		     	            
		     	            //this one is move downside
		       if (solveMain(givenMatrix, x+1 , y, path) )
		               return true; 
		       //this one is move right side
		       if (solveMain(givenMatrix, x, y + 1, path)) 
	               return true; 
		       //This one is move upside
	            if (solveMain(givenMatrix, x-1 , y, path) )
		                return true; 
	            //This one is used to leftside
		            if (solveMain(givenMatrix, x, y - 1, path)) 
		                return true;   
		            //Then finally no one is match set last sol setted position to Zero
		            path[x][y] = 0; 
		            return false; 
		         } 
	        return false; 
		    } 
		    public static void main(String args[]) 
		    { 
		        PathFinding pathFindingObject = new PathFinding(); 
		        int givenMatrix[][] = { { 0, 0, 0, 0, 0, 1, 0, 0 }, 
	  		                     { 0, 0, 0, 0, 0, 1, 0, 0 },  
	  		                     { 1, 1, 0, 0, 0, 1, 0, 0 }, 
	  		                     { 0, 1, 0, 0, 0, 1, 0, 0 }, 
	  		                     { 0, 1, 0, 1, 1, 1, 1, 1 }, 
	  		                     { 0, 1, 1, 1, 0, 1, 1, 0 }, 
	  		                     { 0, 1, 0, 1, 0, 1, 1, 0 }, 
	  		                     { 0, 1, 0, 0, 0, 0, 0, 0 } }; 
		  
		        N = givenMatrix.length; 
		        pathFindingObject.find(givenMatrix); 
		    }
	}
