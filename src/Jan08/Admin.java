package Jan08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	static Scanner scannerObject=new Scanner(System.in);
static void addproducts()
{
	ArrayList al=new ArrayList();
	System.out.println("Enter the name");
	al.add(scannerObject.nextLine());
	System.out.println("Enter the Description");
	al.add(scannerObject.nextLine());
	System.out.println("Enter the Price");
	al.add(scannerObject.next());
	System.out.println("Enter the Quality");
	al.add(scannerObject.next());
	System.out.println("Enter the Quantity");
	al.add(scannerObject.next());
	System.out.println("Please select option \n 1.print \n 2.Store  \n 3 Re-enter");
	int data=scannerObject.nextInt();
	switch(data)
	{
	case 1:
	{
	    System.out.println(al);
	    break;
	}
	case 2:
	{
	    try {
	        Class.forName("org.sqlite.JDBC");
	        Connection c=DriverManager.getConnection("jdbc:sqlite:/home/hmspl/Downloads/Ecom");
	        Statement s1= c.createStatement();
	        ResultSet ss=s1.executeQuery("select * from products");
	        
	            s1.execute("insert into Student (Name) values ('"+al.get(0).toString()+"')");
	            s1.execute("insert into Student (Description) values ('"+al.get(1).toString()+"')");
	            s1.execute("insert into Student (Price) values ('"+al.get(2).toString()+"')");
	            s1.execute("insert into Student (Quality) values ('"+al.get(3).toString()+"')");
	            s1.execute("insert into Student (Quantity) values ('"+al.get(4).toString()+"')");
	 
	    } catch ( ClassNotFoundException | SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }}
	    case 3:
	    {
	    	al.removeAll(al);
	    	addproducts();
	    }
}showdetails();}
static void removeproducts()
{
	 try {
	        Class.forName("org.sqlite.JDBC");
	        Connection c=DriverManager.getConnection("jdbc:sqlite:/home/hmspl/Downloads/Ecom");
	        Statement s1= c.createStatement();
	       viewproducts();
	       System.out.println("Enter the SiNo number to remove product");
	       int value=scannerObject.nextInt();
	           s1.execute("DELETE from products where SiNo="+value+"");
	    } catch (ClassNotFoundException | SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }showdetails();}
static void viewproducts()
{
	 try {
	        Class.forName("org.sqlite.JDBC");
	        Connection c=DriverManager.getConnection("jdbc:sqlite:/home/hmspl/Downloads/Ecom");
	        Statement s1= c.createStatement();
	        ResultSet ss=s1.executeQuery("select * from products");
	        System.out.println("SINo  Name  Price  Description      Quality  Quantity");
	            while(ss.next()){
	           System.out.print(ss.getString("SiNo")+"   ");
	           System.out.print(ss.getString("Name")+" ");
	           System.out.print(ss.getString("Price")+" ");
	           System.out.print(ss.getString("Description")+"   ");
	           System.out.print(ss.getString("Quality")+"    ");
	           System.out.print(ss.getString("Quantity")+" ");
	           System.out.println();
	        }	    } catch (ClassNotFoundException | SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	 System.out.println();
	 showdetails();
}
static void showdetails()
{
	System.out.println("Add products press 1");
	System.out.println("remove products press 2");
	System.out.println("View products press 3");
	System.out.println("exit press 4");
	int option=scannerObject.nextInt();
	switch(option)
	{
	case 1:addproducts();break;
	case 2:removeproducts();break;
	case 3:viewproducts();break;
	case 4:System.exit(0);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
showdetails();
	}

}
