package Jan07;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Ecom {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	ArrayList al=new ArrayList();
	String input="";
	int i=0;
	do
	{
	System.out.println("Enter the name");
	al.add(s.next());
	System.out.println("If you want to caontinue");
	input=s.next();

	}while(input.equals("y"));
	System.out.println("Please select option \n 1.print \n 2.Store");
	int data=s.nextInt();
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
	        Connection c=DriverManager.getConnection("jdbc:sqlite:/home/hmspl/Downloads/train_online_orders.db");
	        Statement s1= c.createStatement();
	        ResultSet ss=s1.executeQuery("select * from Student");
	        while(i<al.size()){
	            String g=(String)al.get(i);
	            s1.execute("insert into Student (name) values ('"+g+"')");
	            i++;
	        }
	 
	 
	    } catch (ClassNotFoundException | SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	}   
	}
	}
