package org.qa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dataBaseConnection {

	private final String url;
	private Properties properties;
		
		public dataBaseConnection(String host, String dataBaseName, String userName, String password)
		{
			
		this.url="jdbc:mysql://"+host+"/"+dataBaseName;
		this.properties=new Properties();
		this.properties.setProperty("user", userName);
		this.properties.setProperty("password", password);

	}
		public Connection getConnection() throws SQLException
		{
			return DriverManager.getConnection(this.url, this.properties);
		}

}
