package Dec31;

import java.util.Scanner;

//compare two Strings
/*Output
I am john. I have been working for this company for the past 4 yrs.
am john
yes*/
public class CompareTwoStrings {
	
	//This method is used to compare the two strings 
	
static void compare(String word,String wordone)
{
	int count=0;
	int i=0,j=0;
	while(i<wordone.length()&&j<word.length())
	{
			if(wordone.charAt(i)==word.charAt(j))
			{
				
				count++;
				i++;
			}
			
			j++;
		
	}
	if(count==wordone.length())
	System.out.println("yes");
	else System.out.println("No");
}
	public static void main(String[] args) {
Scanner scannerObject=new Scanner(System.in);
compare(scannerObject.nextLine(),scannerObject.nextLine());
	}

}
