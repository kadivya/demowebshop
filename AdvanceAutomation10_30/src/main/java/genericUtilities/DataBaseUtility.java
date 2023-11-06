package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

public class DataBaseUtility implements IAutoConstants
{
	/**
	 * DataBaseUtility is used to read the data from Database
	 */
	Driver dbdriver=null;
	Connection connection;
	Statement statement;
	ResultSet result;
	
public void establishingConnections() {
	try {
		dbdriver=new Driver();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		DriverManager.registerDriver(dbdriver);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		 connection =DriverManager.getConnection(DATABASE_URL,DATABASE_UN,DATABASE_PWD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public ArrayList readingDataFromDatabase(String query,String columnname) {
	
	ArrayList list=new ArrayList();
	try {
		 statement = connection.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		 result = statement.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		while(result.next()) {
			 try {
				list.add(result.getString(columnname));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
public void closingConnections() {
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
