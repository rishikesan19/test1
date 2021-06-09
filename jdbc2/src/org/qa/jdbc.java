package org.qa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {
			dataBaseConnection dbc =new dataBaseConnection("localhost:3306","countrysales","root","Samurai@19");
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = dbc.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet =statement.executeQuery("Select count(*) from country");
				while(resultSet.next())
				{
					System.out.println(resultSet.getInt(1));
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			} //catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}

	}

}
