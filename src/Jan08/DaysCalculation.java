package Jan08;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;
public class DaysCalculation {
	static void count(String Date1,String Date2)throws ParserConfigurationException, ParseException
	{
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Date date1 = (Date) myFormat.parse(Date1);
		Date date2 = (Date) myFormat.parse(Date2);
		long diff = date2.getTime() - date1.getTime();
		System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	}
	public static void main(String args[]) throws ParserConfigurationException, ParseException 
	{
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the Dates via DD MM YYYY This Format");
	String Date1 = scannerObject.next();
	String Date2 =  scannerObject.next();
    count(Date1,Date2);

}
}