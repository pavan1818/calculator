import java.io.IOException;
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws SQLException, IOException
	{
			Connection con = null;
			try
			{
				con = DriverManager.getConnection(" ");
			}
			catch(Exception e)
			{	}
			finally
			{
				//clean-up
				con.close();
			}
	}
	
}
