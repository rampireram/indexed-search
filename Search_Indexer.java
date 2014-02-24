import java.util.Scanner;
import java.io.*;
import java.sql.*;
import java.util.*;
public class Search_Indexer
{
  public static void main( String args[] )throws FileNotFoundException, IOException, SQLException
  {
    Connection c = null;
    Statement stmt = null;
	Scanner s = new Scanner(System.in);
	String str = null;
	ResultSet rs = null;
	long l = 0;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:files_test.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");
	  System.out.println("Do you want to perform \"Like\" search?");
	  int flag = s.nextInt();
	if(flag==1)
	{
    str = s.next();
    java.util.Date d = new java.util.Date();
    l = d.getTime();
    stmt = c.createStatement();
    rs = stmt.executeQuery( "SELECT * FROM file_sys where name like '%" + str + "' order by modified DESC;" );
    }
	else
	{
    str = s.next();
    java.util.Date d = new java.util.Date();
    l = d.getTime();
    stmt = c.createStatement();
    rs = stmt.executeQuery( "SELECT * FROM file_sys where name = '" + str + "' order by modified DESC;" );
	}
	int n=0;
      while ( rs.next() ) {
         String  name = rs.getString("name");
         String  time = rs.getString("time");
         String  loc = rs.getString("location");
         
         System.out.print( "Name = " + name );
         System.out.print( "  Modified = " + time );
       System.out.print( "  Location @ " + loc );
           System.out.println();
           n++;
      }
      if(n==0)
      {
        System.out.println("No records found!");
        return;
      }
      java.util.Date d1 = new java.util.Date();
      long l2 = d1.getTime();
      System.out.print("Executed in : ");
      
      System.out.print(l2-l);
      System.out.print(" ms");
      
      
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println();
      
    System.out.println("Retreived successfully");
    
  }
  
 
}
