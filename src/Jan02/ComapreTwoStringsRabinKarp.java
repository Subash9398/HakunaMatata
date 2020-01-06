package Jan02;

import java.util.Scanner;

/*
 Rabin-Karp Algorithm
 
Output
Enter the First paragraph
I am john. I have been working for this company for the past 4 yrs.
Enter the pattern
am john
Enter prime Number
101
Pattern found at index 2*/

public class ComapreTwoStringsRabinKarp {

	public final static int d = 256; 
 
    static void search(String pattern, String txt, int prime) 
    { 
        int M = pattern.length(); 
        int N = txt.length();
     
        int i, j; 
        int patternhashvalue = 0; // hash value for pattern 
        int texthashvalue = 0; // hash value for txt 
        int h = 1; 
      
        for (i = 0; i < M-1; i++) 
         h = (h*d)%prime; 
      
        //This p is the pattern hash value
        //This t is the pattern length text hash value
        
        for (i = 0; i < M; i++) 
        { 
        	patternhashvalue = (d*patternhashvalue + pattern.charAt(i))%prime; 
            texthashvalue = (d*texthashvalue + txt.charAt(i))%prime;    
        } 

        //if the text and pattern hash value is equal means it check the continuous
        //char values
        for (i = 0; i <= N - M; i++) 
        { 
            if ( patternhashvalue == texthashvalue ) 
            { 
                for (j = 0; j < M; j++) 
                { 
                    if (txt.charAt(i+j) != pattern.charAt(j)) 
                        break; 
                } 
      
                //The values are equal to the pattern length print the i value
                //for the reason of check the index of the pattern
                
                if (j == M) 
                    System.out.println("Pattern found at index " + i); 
            } 
      
            if ( i < N-M ) 
            { 
            	texthashvalue = (d*(texthashvalue - txt.charAt(i)*h) + txt.charAt(i+M))%prime; 
      
                // We might get negative value of t, converting it 
                // to positive 
                if (texthashvalue< 0) 
                	texthashvalue = (texthashvalue + prime); 
                
            } 
        } 
    } 
      
    public static void main(String[] args) 
    { 
    	Scanner scannerObject=new Scanner(System.in);
    	System.out.println("Enter the First text");
        String txt = scannerObject.nextLine();
        System.out.println("Enter the pattern");
        String pattern = scannerObject.nextLine();
        System.out.println("Enter prime Number");
        int q = scannerObject.nextInt();
        search(pattern, txt, q); 
    } 
} 

