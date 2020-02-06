package Jan08;

import java.util.Scanner;
public class Login {
	static Scanner scannerObject=new Scanner(System.in);
	static void createaccount()
	{
		System.out.println("Enter the name");
		String username=scannerObject.next();
		System.out.println("Enter the password");
		String password=scannerObject.next();
	}
	static void login()
	{
		System.out.println("Enter the UserName");
		String username=scannerObject.next();
		System.out.println("Enter the Password");
		String password=scannerObject.next();
		//if(username.contentEquals(cs)&&password.equals(a))	
	}
	static void showoption()
	{
		System.out.println("If you want to login press 1");
		System.out.println("If you want to create account press 2");
		int input=scannerObject.nextInt();
		if(input==1)
			login();
		else if(input==2)
			createaccount();
		else
			System.out.println("Please login or create account");
	}
public static void main(String args[])
{
		
}
}
