package Jan06;
import java.net.InetAddress;
import java.util.Scanner;
import java.util.regex.*;
public class ValidateIpAddress {


		static boolean splitnumber(String str) 
		{ 
		boolean value=Pattern.matches("^((0 | 1\\d?\\d? | 2[0-4]?\\d? | 25[0-5]? | [3-9]\\d?)\\.) {3} (0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$", str);
		   return value;         
		} 
		static void validate(String ipAddress)
		{
			boolean ip=splitnumber(ipAddress);
			if(ip==true)
				System.out.println(ipAddress+" is valid ip address");
			else
				System.out.println(ipAddress+" is not valid");
				
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	String ipAddress=scannerObject.next();
    validate(ipAddress);
		}
	}
