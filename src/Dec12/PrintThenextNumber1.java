package Dec12;

import java.util.Scanner;

public class PrintThenextNumber1 {

	//This one is used to split the number in dynamic array
	static String[] splitnumber(String str) 
	{ 
	    String []number=new String[0];
	    String s="";
	    for (int i=0; i<str.length(); i++) 
	    { 
	    
	        if (Character.isDigit(str.charAt(i))) 
	        {s=s+String.valueOf(str.charAt(i));
	       if(i<str.length()-1&&Character.isDigit(str.charAt(i+1)))
	    	   continue;
	       String []temporary=new String[number.length+1];
	       temporary[temporary.length-1]=s;
	       for(int j=0;j<number.length;j++)
    	   {
    	   temporary[j]=number[j];
    	   }
	       number=temporary;
	    	   }
	       s="";	     
	    } 
	   return number;     
	    
	} 
	
	static //This one is used to split the letter in dynamic array
	String[] splitletter(String str) 
	{ 
	    String []letter=new String[0];
	    String s="";
	    for (int i=0; i<str.length(); i++) 
	    { 
	    
	        if (Character.isAlphabetic(str.charAt(i))) 
	        {	s=s+String.valueOf(str.charAt(i));
	       if(i<str.length()-1&&Character.isAlphabetic(str.charAt(i+1)))
	    	   continue;
	       String []temporary=new String[letter.length+1];
	       temporary[temporary.length-1]=s;
	       for(int j=0;j<letter.length;j++)
    	   {
    	   temporary[j]=letter[j];
    	   }
	       letter=temporary;}
	       s="";
	    } 
	   return letter;     
	    
	}
	static void result(String value)
	{
		String letter[]=splitletter(value);
		String number[]=splitnumber(value);
		//Print the values
		for(int i=0;i<letter.length;i++)
		{int k=Integer.valueOf(number[i]);
		for(int j=0;j<k;j++)
		{
		System.out.print(letter[i]);
		}}
			}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scannerObject=new Scanner(System.in);
String value=scannerObject.next();
result(value);

}
}

//output
//a2b4av4
//aabbbbavavavav
