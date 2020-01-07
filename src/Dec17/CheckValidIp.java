package Dec17;

import java.util.Scanner;

public class CheckValidIp {
	static int[] splitnumber(String str) 
	{ 
	String split[]=str.split("[.]");
	int number[]=new int[split.length];
	for(int i=0;i<split.length;i++)
	{
	    if(split[i].equals(""))
			number[i]=256;
	    else if(Character.isDigit(split[i].charAt(0)))
		number[i]=Integer.parseInt(split[i]);
		else
			number[i]=256;
	}
	   return number;         
	} 
	static void check(String ipAddress)
	{
		int ip[]=splitnumber(ipAddress);
		int count=0;
		for(int i=0;i<ip.length;i++)
		{
			if(ip[i]>=0&&ip[i]<=255)
				count++;
		}
		if(count==4)
			System.out.println(ipAddress+" is valid ip address");
		else
			System.out.println(ipAddress+" is not valid");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scannerObject=new Scanner(System.in);
String ipAddress=scannerObject.next();
check(ipAddress);
	}
}

//output
//192.168.2.1
//192.168.2.1 is valid ip address
