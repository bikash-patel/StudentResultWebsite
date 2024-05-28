package result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConCodePrac {
	ResultDataPrac rdp=null;
	public ResultDataPrac getPracResult(String hno)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement pst=con.prepareStatement("select * from studentmark where hallticketnumber=?");
			pst.setString(1,hno);
			ResultSet rs=pst.executeQuery();
			rdp=new ResultDataPrac();
			if(rs.next())
			{
				rdp.setcPrac(rs.getInt(9));
				rdp.setCppPrac(rs.getInt(10));
				rdp.setJavaPrac(rs.getInt(11));
				rdp.setWebtechnologyPrac(rs.getInt(12));
				rdp.setDsaPrac(rs.getInt(13));
				rdp.setDigitallogicPrac(rs.getInt(14));
				return rdp;
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
