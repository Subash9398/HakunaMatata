package Jan06;

import java.util.Scanner;
import java.util.regex.*;


/*Output
Subash@18
Subash@18 is weak and valid password*/

public class PasswordValidate {


	static boolean splitnumber(String password) 
	{ 
		//check the length
		if(!(password.length()>=8))
		return false;
		//These condition check lower case
	if(!Pattern.matches("(.*)([a-z]{1,})(.*)", password))
		return false;
	//This  condition check the upper case
	if(!Pattern.matches("(.*)([A-Z]{1,})(.*)", password))
		return false;
	//This condition check the numbers
	if(!Pattern.matches("(.*)([0-9]{1,})(.*)", password))
		return false;
	//This condition check the symbols
	if(!Pattern.matches("(.*)([@#$%^&*]{1,})(.*)", password))
		return false;
	   return true;         
	} 
	
	static void validate(String password)
	{
		boolean result=splitnumber(password);
		if(result==true)
		{if(password.length()>=8)
			System.out.println(password+" is weak and valid password");
		else if (password.length()>=10)
			System.out.println(password+" is normal and valid password");
		else if(password.length()>11)
			System.out.println(password+" is strong and valid password");}
		else
			System.out.println(password+" is not valid");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scannerObject=new Scanner(System.in);
String password=scannerObject.next();
validate(password);
	}

}
