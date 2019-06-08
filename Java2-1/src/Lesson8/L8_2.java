package Lesson8;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Calendar; 

public class L8_2 {
	public static void main(String args[]){
		
	 	PreparedStatement ps=null;
	    Connection ct=null;
	    ResultSet rs=null;
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
		String dateNowStr=sdf.format(d);
		System.out.println(dateNowStr);
		
		Calendar now= Calendar.getInstance();
		
		int byear=2018;
		int bmonth=11;
		int bday=4;
		float price=4.3f;
		

		int day=(now.get(Calendar.YEAR)-byear)*365+(now.get(Calendar.MONTH)+1-bmonth)*30+(now.get(Calendar.DAY_OF_MONTH)-bday);
		
		System.out.println(price);
		
//		int input_bookno=10014;
//		int input_stuno=183470;
//		try {
//	    	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//	    	  ct=DriverManager.getConnection("jdbc:odbc:sql server");
//
//			  ps=ct.prepareStatement("insert into record values('"+input_bookno+"','"+input_stuno+"','"+dateNowStr+"','null','Yes','No')");
//			  rs=ps.executeQuery();
//		  }
//
//
//  catch(Exception e1){e1.printStackTrace();}
//	    finally
//	    {
//	    	try {
//		    		if(rs!=null)
//					{
//						rs.close();
//					}
//		    		if(ps!=null)
//					{
//						ps.close();
//					}
//					if(ct!=null)
//					{
//						ct.close();
//					}
//					
//				} catch(Exception e1){e1.printStackTrace();}
//		    }
//			


	}

}
