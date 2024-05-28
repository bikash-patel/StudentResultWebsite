package result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConCodeWritten {
	ResultDataWritten rdw=null;
    public ResultDataWritten getWrittenResult(String hno)
    {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement pst=con.prepareStatement("select * from studentmark where hallticketnumber=?");
			pst.setString(1,hno);
			ResultSet rs=pst.executeQuery();
			rdw=new ResultDataWritten();
			if(rs.next())
			{
				rdw.setHallticketnumber(rs.getString(1));
				rdw.setName(rs.getString(2));
				rdw.setcWritten(rs.getInt(3));
				rdw.setCppWritten(rs.getInt(4));
				rdw.setJavaWritten(rs.getInt(5));
				rdw.setWebtechnologyWritten(rs.getInt(6));
				rdw.setDsaWritten(rs.getInt(7));
				rdw.setDigitallogicWritten(rs.getInt(8));
				return rdw;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return null;
    }
}
