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
	String pat =null;
	ResultSet rs = null;
	kmp_find kk = new kmp_find();
	long l = 0,ans=0,ins=0;
	int a,b,cc,t1,t2;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:files_test.db");
	  stmt = c.createStatement();
    String sql = "CREATE TABLE IF NOT EXISTS temp_sys " +
                   "( name      TEXT      NOT NULL, " + 
                   "  time       TEXT     NOT NULL, " +
                   "diff   NUMBER     NOT NULL,"  +
                   "  location   TEXT     NOT NULL) ";
                    
   stmt.executeUpdate(sql);
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");
	  
    System.out.println("Enter type ");
	str = s.next();
	System.out.println("Enter content ");
	pat = s.next();
	System.out.println("Enter date ");
	a = s.nextInt();
	System.out.println("Enter month ");
b = s.nextInt();
System.out.println("Enter year ");
cc = s.nextInt();
t1 = cc-1970;
t2=0;
switch(b)
{
    case 1:t2=0;break;
    case 2:t2=31;break;
    case 3:t2=31+28;break;
    case 4:t2=31+28+31;break;
    case 5:t2=31+28+31+30;break;
    case 6:t2=120+31;break;
    case 7:t2=120+31+30;break;
    case 8:t2=120+31+30+31;break;
    case 9:t2=120+31+30+31+31;break;
    case 10:t2=243+30;break;
    case 11:t2=243+30+31;break;
    case 12:t2=243+30+31+30;break;
}
ans = (t1*365)+t2+a;
System.out.println(ans);
ans=ans*1440;
ans=ans*60;
ans=ans*1000;
ins=Math.abs(ans-t2);
    java.util.Date d = new java.util.Date();
    l = d.getTime();
    stmt = c.createStatement();
    rs = stmt.executeQuery( "SELECT * FROM file_sys where name like '%" + str + "';" );
    
	int n=0;
      while ( rs.next() ) {
         String  name = rs.getString("name");
         String  time = rs.getString("time");
		 String modified = rs.getString("modified");
         String  loc = rs.getString("location");
		 int pos = kk.ini(loc,pat);
		//System.out.print("And the ans for"+ans);
		if(pos<0)
		continue;
         long ll = Long.parseLong(modified);
		   stmt = c.createStatement();
		   sql = "INSERT INTO temp_sys (name,time,diff,location) " +
                   "VALUES ('" + name + "','" + time + "','" +  Math.abs(ll-ans) + "','" + loc + "');";
      stmt.executeUpdate(sql);
           n++;
      }
	  
	  stmt = c.createStatement();
    rs = stmt.executeQuery( "SELECT * FROM temp_sys where name like '%" + str + "' order by diff;" );
	n=0;
	  /////////////////////////////////////////////////////////////////
	  while ( rs.next() ) {
         String  name = rs.getString("name");
         String  time = rs.getString("time");
		 //String modified = rs.getString("diff");
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
      
      stmt = c.createStatement();
	  sql = "DROP table temp_sys;";
    stmt.executeUpdate(sql);
	
	
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


class kmp_find
{

void failure(String p,int f[])
	{
		int i=1;
		int j=0;
		 f[0]=0;
		 int m=p.length();
		while (i<m)
		{
			if (p.charAt(j)==p.charAt(i))
			{
				f[i]=j+1;
				i++;
				j++;
			}
			else if(j>0)
				j=f[j-1];
				else
				{
					f[i]=0;
					i++;
				}
		}
	}

	int kmp(String t,String p,int f[])
	{
		failure(p,f);
		int i=0;
		int j=0;
		int n=t.length();
		int m=p.length();
		while (i<n)
		{
			if (p.charAt(j)==t.charAt(i))
			{
				if(j==m-1)
					return i-m+2;
				i++;
				j++;
			}
			else if(j>0)
			j=f[j-1];
			else i++;
		}
		return -1;
	}

    public int ini(String ff,String pat) throws FileNotFoundException, IOException
    {
        File file = new File(ff);
		int flag = -1;
        BufferedReader in = new BufferedReader(new FileReader(file));
        while (in.ready()) {
         String s = in.readLine();
         int[] f= new int[pat.length()];
         int ans = this.kmp(s,pat,f);
         if(ans>=0)
             flag++;
         //System.out.println(ans);
        }
        in.close();
        return flag;
    }


}

