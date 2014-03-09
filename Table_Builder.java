import java.util.Scanner;
import java.io.*;
import java.sql.*;
import java.util.*;
public class Table_Builder
{
  public static void main( String args[] )throws FileNotFoundException, IOException, SQLException
  {
    Connection c = null;
  Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:files_test.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    stmt = c.createStatement();
    String sql = "CREATE TABLE file_sys " +
                   "( name      TEXT      NOT NULL, " + 
                   "  time       TEXT     NOT NULL, " +
                   "modified   NUMBER     NOT NULL,"  +
                   "  location   TEXT     NOT NULL) ";
                    
   stmt.executeUpdate(sql);
  
  File f = null;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the directory to index ");
  String s = sc.nextLine();
   f = new File(s);
   java.util.Date d1 = new java.util.Date();
   long l1 = d1.getTime();
   //String in = "";
  directoryCrawl(c,f);

  java.util.Date d2 = new java.util.Date();
  long l2 = d2.getTime();
  System.out.println("Executed in " + (l2-l1) + " ms");
  }
  
  ///////File~Handler
  private static void directoryCrawl(Connection c,final File f) throws IOException, SQLException {
        
        
    if (f.isDirectory()) {
            final File [] files = f.listFiles();
            
            if (files != null) {
                for (final File file : f.listFiles()) {
                    directoryCrawl(c,file);
                }
            }
        }
        else
        {
//System.out.println(f.getAbsolutePath());
  Statement stmt = c.createStatement();
   java.util.Date date = new java.util.Date();
   long l = f.lastModified();
   date.setTime(l);
  String sql = "INSERT INTO file_sys (name,time,modified,location) " +
                   "VALUES ('" + f.getName() + "','" + date + "','" +  l + "','" + f.getCanonicalPath() + "');";
      stmt.executeUpdate(sql);
    
    
        }

    }
  
}
