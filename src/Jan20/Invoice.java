package Jan20;

import java.util.Scanner;
import java.util.regex.*;

public class Invoice {

	static String[] field = {"name", "phone", "address", "date", "tax", "total amount"};
	static String[] regex = {"[a-zA-Z]+[ ]*", "[\\d]{10}", ".+[-]\\s*\\d{6}", 
			"\\d{2}-\\d{2}-\\d{4}[ ]", "\\d+\\.\\d{2}", "\\d+\\.\\d{2}"};
	
	static void invoice(String input)
	{
		for(int i=0; i<6; i++) {
			Pattern pattern = Pattern.compile(field[i]+"[:]\\s");
			Matcher matcher = pattern.matcher(input);
            matcher.find();
			Pattern pattern2 = Pattern.compile(regex[i]);
			Matcher matcher2 = pattern2.matcher(input);
			matcher2.find(matcher.end());
			System.out.println(field[i] + ": " + matcher2.group());
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the input value");
		invoice(scannerObject.nextLine());
	}

}
