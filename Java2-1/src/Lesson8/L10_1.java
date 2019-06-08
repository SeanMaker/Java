package Lesson8;

import java.sql.*;

public class L10_1 {
	public static void main(String[] args){
		Connection ct=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
	    	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct=DriverManager.getConnection("jdbc:odbc:sql server");
			ps=ct.prepareStatement("select * from STUDENT");
			rs=ps.executeQuery();
			
			
			
			while(rs.next()){
				int number=rs.getInt(1);
				String name=rs.getString(2);
				String age=rs.getString(3);
				System.out.println(number+"    "+name+"    "+age+"    ");
			}
			
		} catch (Exception e) {}
		
		finally
	    {
	    	try {
	    		if(rs!=null)
				{
					rs.close();
				}
	    		if(ps!=null)
				{
					ps.close();
				}
				if(ct!=null)
				{
					ct.close();
				}
				
			} catch (Exception e){}
	    }
	}

}
