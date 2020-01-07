package Dec25;

import java.util.Scanner;

/*Enter the input value
	Enter the input value
	date: 25-12-2019 name: subash phone: 9629985922 address: 10/1, Agraharam 3rd street, keelapavoor, pin - 627806. tax: 1000.00 total amount: 10000.00 
	name:subash
	date:25-12-2019
	address:10/1,Agraharam3rdstreet,keelapavoor,pin-627806.
	phone:9629985922
	tax:1000.00
	totalamount:10000.00*/
public class Invoice {
	static void invoice(String input)
	{
		name(input);
		date(input);
		address(input);
		phone(input);
		tax(input);
		total(input);
	}
	static void name(String input)
	{
		String []splitwords=input.split(" ");
		for(int i=0;i<splitwords.length;i++)
			if(splitwords[i].equalsIgnoreCase("name:"))
				{System.out.print(splitwords[i]);
		System.out.println(splitwords[i+1]);}
	}
	static void date(String input)
	{
		String []splitwords=input.split(" ");
		for(int i=0;i<splitwords.length;i++)
			if(splitwords[i].equalsIgnoreCase("date:"))
				{System.out.print(splitwords[i]);
		System.out.println(splitwords[i+1]);}
	}
	static void address(String input)
	{
		String []splitwords=input.split(" ");
		for(int i=0;i<splitwords.length;i++)
			if(splitwords[i].equalsIgnoreCase("address:"))
			{
				for(int j=i;j<splitwords.length;j++)
					if(splitwords[j].equalsIgnoreCase("pin"))
						{System.out.print(splitwords[j]+splitwords[j+1]+splitwords[j+2]);
						System.out.println();
						break;}
					else System.out.print(splitwords[j]);}
	}
	static void phone(String input)
	{
		String []splitwords=input.split(" ");
		for(int i=0;i<splitwords.length;i++)
			if(splitwords[i].equalsIgnoreCase("Phone:"))
				{System.out.print(splitwords[i]);
		System.out.println(splitwords[i+1]);}
	}
	static void tax(String input)
	{
		String []splitwords=input.split(" ");
		for(int i=0;i<splitwords.length;i++)
			if(splitwords[i].equalsIgnoreCase("tax:"))
				{System.out.print(splitwords[i]);
		System.out.println(splitwords[i+1]);}
	}
	static void total(String input)
	{
		String []splitwords=input.split(" ");
		for(int i=0;i<splitwords.length;i++)
			if(splitwords[i].equalsIgnoreCase("total"))
				{System.out.print(splitwords[i]+splitwords[i+1]);
		System.out.println(splitwords[i+2]);}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	System.out.println("Enter the input value");
	invoice(scannerObject.nextLine());

		}

	}